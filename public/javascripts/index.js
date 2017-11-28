if (window.File && window.FileReader && window.FileList && window.Blob) {
    // Great success! All the File APIs are supported.
} else {
    alert('The File APIs are not fully supported in this browser.');
}
$("document").on('drop',function(event){
    event.preventDefault();
});

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
    }
}
function dragStart(event) {

    event.dataTransfer.setData("img", event.target.id);
}

function handleDragOver(event){
    event.stopPropagation();
    event.preventDefault();
    event.dataTransfer.dropEffect = 'copy';

}

function handleFileSelect(evt) {
    evt.stopPropagation();
    evt.preventDefault();

    var files = evt.dataTransfer.files;
    var file = files[0];
   // processFile(file);

}

function processFile(file){
    var reader = new FileReader();
    reader.onload = function(e) {

        $('#userImage').attr('src', e.target.result);

    }
    reader.readAsDataURL(file);

}