function values(){
    var password=document.getElementById("inval").value
    var con=document.getElementById("inval2").value
    if(password.length==0){
        document.getElementById("sval").innerHTML='*please fill the blank*'
        document.getElementById("inval").style.border="2px solid orange"
        return false;
    }
    if(password.length<=3){
        document.getElementById("sval").innerHTML='*fill with min 3 characteres*'
        document.getElementById("inval").style.border="2px solid orange"
        return false;
    }
    if(password.length>=15){
        document.getElementById("sval").innerHTML='*max lenth is 14 characters*'
        document.getElementById("inval").style.border="2px solid orange"
        return false;
    }
    if(password!=con){
        document.getElementById("sval2").innerHTML='*password missmatch*'
        document.getElementById("inval2").style.border="2px solid orange"
        return false;
    }
    
}