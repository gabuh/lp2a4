
var boolTheme = false;

document.getElementById("theme-switch").addEventListener("click",function(){

    if(boolTheme != true){
        document.documentElement.style.setProperty('--main-background-color','#b8b8b8');
        document.documentElement.style.setProperty('--font-color-buttons','#222222');
        document.documentElement.style.setProperty('--font-color-texts','#333333');
        boolTheme = true;
    } else {
        document.documentElement.style.setProperty('--main-background-color','#222222');
        document.documentElement.style.setProperty('--font-color-buttons','#000000');
        document.documentElement.style.setProperty('--font-color-texts','#ffffff');
        boolTheme = false;
    } 
    console.log(boolTheme)
});



