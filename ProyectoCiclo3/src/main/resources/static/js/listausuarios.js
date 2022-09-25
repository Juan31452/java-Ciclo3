// sidebar toggle
const btnToggle = document.querySelector('.toggle-btn');
const table = document.getElementById('tabla')

btnToggle.addEventListener('click', function () {
  console.log('clik')
  document.getElementById('sidebar').classList.toggle('active');
  console.log(document.getElementById('sidebar'))
  console.log(table)
  
  
});