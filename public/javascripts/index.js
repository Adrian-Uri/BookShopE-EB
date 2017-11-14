
$("document").ready(function(){

    $("#inputCover").change(function() {
        readURL(this);

    });
});


function readURL(input) {

    if (input.files && input.files[0]) {

        var reader = new FileReader();


        reader.onload = function(e) {

            $('#userImage').attr('src', e.target.result);

        }

       reader.readAsDataURL(input.files[0]);
        console.log(reader.result);

    }
}


