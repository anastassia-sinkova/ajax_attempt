$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/sectors",
        success: function(data) {
            const sectorsDropdown = $('#sectors');

            sectorsDropdown.empty();

            for (let i in data) {
                //TODO: add indentation depending on parent
                sectorsDropdown.append('<option value="' + data[i].id + '">' + data[i].name + '</option>');
            }
        }
    });

    $("#clientForm").submit(function(event) {
        event.preventDefault();

        // let formData = {};
        let client = {
            username: "asd"
        };

        $.ajax({
            type: "POST",
            contentType : "application/json",
            dataType: JSON,
            url: "http://localhost:8080/clients",
            // data: JSON.stringify($(this).serialize()),
            data: client,
            // data: $(this).serialize(),
            // data: {
            //     name: $("#name").val()
            // },
            success: function(data) {
                alert(data);
            }
        });

        // $.post(
        //     "http://localhost:8080/clients",
        //     {name: $("#name").val()},
        //     function(data) {
        //         alert("Success");
        //     });
    });
});
