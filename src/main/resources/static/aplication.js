document.addEventListener('DOMContentLoaded', function () {
    const doctorContainer = document.getElementById('doctorBody')
	loadDoctors();
    function loadDoctors() {
        fetch('api/v1/doctors')
            .then(response => response.json())
            .then(data => {
                doctorContainer.innerHTML = ''
				console.log(data);
                data.forEach(doctor => {
                    const tr = document.createElement('tr')
                    tr.innerHTML = `
                        <td>${doctor.name}</td>
                        <td>${doctor.firstName}</td>
                        <td>${doctor.lastName}</td>
                        <td><button class="agendar" data-id="${doctor.id}">Agendar</button></td>
                    `
                    doctorContainer.appendChild(tr)
                })
            })
    }

    
})