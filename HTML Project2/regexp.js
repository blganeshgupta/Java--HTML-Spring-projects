var res ="this is javascript program and this  JAVASCRIPT will be ended soon and javascript call created where "
console.log(res)
// console.log(res.match(/javascript/))//->it gives information given input and it is case sensitive ,it not shows the repeating word it gives only first one information 
// console.log(res.match(/javascript/g))//->it gives information given input and it is case sensitive ,it shows the repeating w information 
// console.log(res.match(/javascript/gi))->it gives information given input and it is not case sensitive,it  shows the repeating word information 
// console.log(res.match(/javascript/m))
console.log(res.match(/javascript/m))
console.log(res.replace(/javascript/,"front end"))
console.log(res.replace(/javascript/g,"JS"))
console.log(res.replace(/javascript/ig,"JSQuiry"))
console.log(/^g/.test(res))//->this is test given input present or not at the end
console.log(/^i/.test(res))
console.log(/^i/.test(res))
console.log(/^t/.test(res))
var mail='blgaeshgupta@SpeechGrammarList.com'
console.log(/$v/.test(mail))//->this is test given input present or not at the end
console.log(/m$/.test(mail))
console.log(/.com$/.test(mail))
console.log(/.com$/.test(res))
console.log(/where$/.test(res))