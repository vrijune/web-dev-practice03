window.addEventListener("load", function () {

    function displayBio(biographies) {
        let mainContent = document.querySelector("#content");

        for (let biography of biographies) {
            mainContent.innerHTML += `
            <h2>${biography.name}</h2>
            <p>${biography.age}</p>
            <p>${biography.biography}</p>
            `;

        }

    }

    async function loadBio() {
        let responseObject = await fetch("./biographies");
        let biographies = await responseObject.json();

        displayBio(biographies);
    }

    loadBio();

});