# Biff starter project

This is the starter project for Biff.

Run `clj -M:dev dev` to get started. See `clj -M:dev --help` for other commands.

Consider adding `alias biff='clj -M:dev'` to your `.bashrc`.

## Chart using APEXCHARTS.JS

This repository is a simple explanation of how to display charts on Biffweb.

What I have done is: 
- Added ApexChart to `ui.clj`
- Added `/chart` routing
- Implemented in `chart.clj`
- Wrote JavaScript in `main.js`

After cloning this repository and running `clj -M:dev dev`, you should be able to see a Bar chart at http://localhost:8080/chart.


