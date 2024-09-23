// When plain htmx isn't quite enough, you can stick some custom JS here.

function renderChart(element) {
    var options = JSON.parse(element.getAttribute('data-chart-contents'));
    var chart = new ApexCharts(document.querySelector("#chart"), options);
    // var chart = new ApexCharts(document.getElementById("chart"), options);
    chart.render();
}
