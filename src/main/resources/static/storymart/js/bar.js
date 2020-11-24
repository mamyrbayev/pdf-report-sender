new Chart(document.getElementById("bar-chart"), {
    type: 'bar',
    data: {
      labels: ["2021","2022"],
      datasets: [
        {
          label: "Population (millions)",
          backgroundColor: ["#9A9B9C", "#9A9B9C",],
          data: [510,215],

        }
      ]
    },
    options: {
      legend: { display: false },
      title: {
        display: true,
      },
      responsive: true,
      scales: {
        xAxes: [{
            scaleLabel: {
               display: true,
               labelString: '',
            },
            gridLines: {
               display: false,
               drawBorder: false //<- set this
            },
            ticks: {
                fontColor: "#152731", 
                fontSize: '26',
                fontWeight: 700
              },
         }],
         yAxes: [{
            gridLines: {
               display: true,
               drawBorder: true //<- set this
            },
            ticks: {
                display: false
            }
         }]
      }
    },


});