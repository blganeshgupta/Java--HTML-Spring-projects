function number(){
    var num=document.getElementById("pnum").value
    if(num.length==0){
        document.getElementById("msg").innerHTML="**please fill details here**"
        document.getElementById("pnum").style.border="1px solid pink"
        return false
        
    }
    else if(isNaN(num)){
        document.getElementById("msg").innerHTML="fill only numbers here"
        document.getElementById("pnum").style.border="1px dotted red"
        return false
    }
    else if(num.length<10)
    {
        document.getElementById("msg").innerHTML="**entered number is less than 10 digits**"
        document.getElementById("pnum").style.border="1px solid pink"
        return false
    }
    else if(num.length>10)
    {
        document.getElementById("msg").innerHTML="**entered number is greater than 10 digits**"
        document.getElementById("pnum").style.border="1px solid yellow"
        return false
    }
    else if(num.charAt(0)<6)
    {
        document.getElementById("msg").innerHTML="**please enter the number starts with 6 or 7 or 8 or 9**"
        document.getElementById("pnum").style.border="1px solid orange"
        return false
    }
}