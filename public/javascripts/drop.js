imageId = "#";

function allowDrop(ev){
    ev.preventDefault();
    ev.dataTransfer.dropEffect = 'copy'
}

function ondropImage(ev){
    ev.preventDefault();
    $("#userImage").attr("src",  imageId);
}

function drag(dragevent, that){
    imageId = that.getAttribute('src');
}