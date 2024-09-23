# Biffweb and ApexChart

This repository is a simple explanation of how to display charts on Biffweb.

What I have done is: 

- Added ApexChart to `ui.clj`
- Added `/chart` routing
- Added fixture data
- Implemented in `chart.clj`
- Wrote JavaScript in `main.js`

To see chart : 
1. Clone this repository 
2. `clj -M:dev dev`
3. Start REPL
4. on `dev/repl.clj`, run `(add-fixtures)`
5. then, you should be able to see a Bar chart at http://localhost:8080/chart.


