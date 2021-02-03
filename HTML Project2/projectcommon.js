var bal=50000;
date=new Date()
function display(inone,intwo,intree){

    if(inone>=bal){
        document.getElementById("ifput1").innerHTML="insuuficient funds in your account, your balance is:"+bal   
    }
    else{
        var amount= Number(bal)-Number( inone)
        document.getElementById("ifput2").innerHTML="Your transection is sucessful,take your cash"  
        document.getElementById("helse1").innerHTML="Account Number"
        document.getElementById("else1").innerHTML="254014524125"  
        document.getElementById("helse2").innerHTML="Taken Amount"  
        document.getElementById("else2").innerHTML=inone    
        document.getElementById("helse3").innerHTML="Description"
        document.getElementById("else3").innerHTML=intwo
        document.getElementById("helse4").innerHTML="Balance Amount"
        document.getElementById("else4").innerHTML=amount
        document.getElementById("helse5").innerHTML="Date of transection"
        document.getElementById("else5").innerHTML=date
 document.getElementById("wish").innerHTML="**Have a Nice Day :)**"

    }
}
function display2(a){
    var amount= Number(bal)+Number( a)
if(a<1){
    document.getElementById("ifput1").innerHTML="please enter valid Amount"
}
else{
    document.getElementById("ifput2").innerHTML="Your transection is sucessful,Check Details"
    document.getElementById("helse1").innerHTML="Account Number" 
    document.getElementById("else1").innerHTML="254014524125" 
    document.getElementById("helse2").innerHTML="Deposited Amount"
    document.getElementById("else2").innerHTML=a
    document.getElementById("helse3").innerHTML="Balance Amount"
    document.getElementById("else3").innerHTML=amount
    document.getElementById("helse4").innerHTML="Date"
    document.getElementById("else4").innerHTML=date
    
    document.getElementById("wish").innerHTML="**Have a Nice Day :)**"

}

}
function display3(a){
if(a.length==0){
    document.getElementById("ifput1").innerHTML="please enter pin"
}
else{
    document.getElementById("helse1").innerHTML="Account Number" 
    document.getElementById("else1").innerHTML="254014524125" 
    document.getElementById("helse2").innerHTML="Balance Amount"
    document.getElementById("else2").innerHTML=bal
    document.getElementById("wish").innerHTML="Have a Nice Day :)"

}

}