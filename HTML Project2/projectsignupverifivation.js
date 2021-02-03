
function validation(){
    var fsn=document.getElementById("infn").value
    var lsn=document.getElementById("inln").value
    var frn=document.getElementById("infrn").value
    var mrn=document.getElementById("inmrn").value
    var male=document.getElementById("ml").checked
    var female=document.getElementById("fml").checked
    var others=document.getElementById("fml").checked
    var aadhar=document.getElementById("adr").value
    var pan=document.getElementById("inpan").value
    var mobile=document.getElementById("mbl").value
    var mail=document.getElementById("mail").value
    var pswd=document.getElementById("psd").value
    
    var ckd=document.getElementById("last").checked
    
    console.log(ckd)
    if(fsn.length==0){
        document.getElementById('fnmsg').innerHTML='*please fill details here*'
        document.getElementById('infn').style.border='2px solid red'
        return false
    }
    else if(/^[A-Za-z\s]{5,15}$/.test(fsn)==false){
        document.getElementById("fnmsg").innerHTML="**something wrong**"
        document.getElementById("infn").style.border="1px solid red"
        return false
    }
    else if(lsn.length==0){
        document.getElementById('lnmsg').innerHTML='*please fill details here*'
        document.getElementById('inln').style.border='2px solid red'
        return false
    }
    else if(/^[A-Za-z\s]{5,15}$/.test(lsn)==false){
        document.getElementById("lnmsg").innerHTML="**something wrong**"
        document.getElementById("inln").style.border="1px solid red"
        return false
    }
    else if(frn.length==0){
        document.getElementById('frnmsg').innerHTML='*please fill details here*'
        document.getElementById('infrn').style.border='2px solid red'
        return false
    }
    else if(/^[A-Za-z\s]{5,15}$/.test(frn)==false){
        document.getElementById("frnmsg").innerHTML="**something wrong**"
        document.getElementById("infrn").style.border="1px solid red"
        return false
    }
    else if(mrn.length==0){
        document.getElementById('mrnmsg').innerHTML='*please fill details here*'
        document.getElementById('inmrn').style.border='2px solid red'
        return false
    }
    else if(/^[A-Za-z\s]{5,15}$/.test(mrn)==false){
        document.getElementById("mrmsg").innerHTML="**something went wrong**"
        document.getElementById("inmrn").style.border="1px solid red"
        return false
    }

    else if(male==false && female==false && others==false){
        document.getElementById('gender').innerHTML='*select Gender*'
       return false
    }
    else if(aadhar.length==0){
        document.getElementById('adrmsg').innerHTML='*please fill details here*'
        document.getElementById('adr').style.border='2px solid red'
        return false

    }
    else if(/^[1-9]{5,15}$/.test(aadhar)==false){
        document.getElementById("adrmsg").innerHTML="**something wrong**"
        document.getElementById("adr").style.border="1px solid red"
        return false
    }
    else if(pan.length==0){
        document.getElementById('panmsg').innerHTML='*please fill details here*'
        document.getElementById('inpan').style.border='2px solid red'
        return false

    }
    else if(/^[A-Za-z1-9]{5,15}$/.test(pan)==false){
        document.getElementById("panmsg").innerHTML="**something wrong**"
        document.getElementById("inpan").style.border="1px solid red"
        return false
    }
    else if(mobile.length==0){
        document.getElementById('mblmsg').innerHTML='*please fill details here*'
        document.getElementById('mbl').style.border='2px solid red'
        return false

    }
    else if(mobile.charAt(0)<6)
    {
        document.getElementById("mblmsg").innerHTML="**please enter the number starts with 6 or 7 or 8 or 9**"
        document.getElementById("mbl").style.border="1px solid orange"
        return false
    }

    else if(/^[0-9]{10}/.test(mobile)==false){
        document.getElementById("mblmsg").innerHTML="**invalid number**"
        document.getElementById("mbl").style.border="1px solid red"
        return false
    }
    else if(mobile.length!=10){
        document.getElementById("mblmsg").innerHTML="**invalid number**"
        document.getElementById("mbl").style.border="1px solid red"
        return false
    }
    else if(mail.length==0){
        document.getElementById('mailmsg').innerHTML='*please fill details here*'
        document.getElementById('mail').style.border='2px solid red'
        return false

    }
    else if(/[a-z0-9]{5,15}(@gmail.com)$/.test(mail)==false)
    {
        document.getElementById("mailmsg").innerHTML="**please enter valid mail id**"
        document.getElementById("mail").style.border="1px solid red"
        return false
    }
    else if(pswd.length==0){
        document.getElementById('psdmsg').innerHTML='*please fill details here*'
        document.getElementById('psd').style.border='2px solid red'
        return false

    }
    else if(/[A-Za-z0-9$@]{8,14}/.test(pswd)==false)
    {
        document.getElementById("psdmsg").innerHTML="**invalid**"
        document.getElementById("psd").style.border="1px solid red"
        return false
    }
    // else if(have==false){
    //     if(not==false){
    //     document.getElementById('got').innerHTML='*select option*'
    //    return false
    //     }
    // }
    
    else if(ckd==false){
        document.getElementById('lstmsg').innerHTML='*select check box*'
       return false
    }














}