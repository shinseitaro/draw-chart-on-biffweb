(ns com.example.chart
  (:require [com.example.ui :as ui]
            [com.biffweb :as biff]
            [cheshire.core :as cheshire]))

(defn serialize-sales-data [sales-data]
  (let [sort-by-year (sort-by :sales/year sales-data)
        year         (map :sales/year sort-by-year)
        sales        (map :sales/data sort-by-year)]
    (cheshire/generate-string
     {:chart  {:type "bar"}
      :series [{:name "sales"
                :data sales}]
      :xaxis  {:categories year}})))

(defn get-data
  [{:keys [biff/db]
    :as   ctx}]
  (let [data (biff/q db
                     '{:find  (pull e [*])
                       :where [[e :sales/year]]})]
    (serialize-sales-data data)))

(defn chart-page [ctx]
  (ui/page
   {:base/title (str "drawing charts on biffweb")}
   [:h1 {:class "m-4 text-4xl font-extrabold dark:text-white"} "Chart"]
   [:div {:class "flex flex-col"}
    [:p "chart"
     (let [sales-data (get-data ctx)]
       [:div {:id                  "chart"
              :data-chart-contents sales-data
              :_                   "on load call renderChart(me)"}])]]))

(def module
  {:routes ["/chart"
            ["" {:get chart-page}]
            ["/sales" {:get get-data}]]})

            
