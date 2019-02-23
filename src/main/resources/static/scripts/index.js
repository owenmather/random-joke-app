
function submitForm() {
    var xhr = new XMLHttpRequest();
    var formData = new FormData(document.getElementById("form"));
    var request = '{"description": "'+formData.get("jokeDescription")+'" }';

    xhr.open("POST", '/jokes', true);

    //Send the proper header information along with the request
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");

    xhr.onreadystatechange = function() { // Call a function when the state changes.
        if (this.readyState === XMLHttpRequest.DONE && this.status === 200) {
            // Request finished. Do processing here.
        }
    }
    xhr.send(request);
    // xhr.send(new Int8Array());
    // xhr.send(document);
}