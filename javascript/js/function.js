"use script"

var num1 = 12;
var num2 = 456;

function suma(num1, num2) {
    let suma = num1 + num2;
    return console.log(suma);
}

suma(num1, num2);


var ingrediente = "Tomate";
var ingrediente2 = "Cebolla";
var ingrediente3 = "Falte yo";

//REST

function cocinar(ingrediente1, ingrediente2, ...ingredientes) {
    console.log(ingrediente1);
    console.log(ingrediente2);
    console.log(ingrediente3);
}

cocinar(ingrediente, ingrediente2, ingrediente3);


//SPRED

function cocinar2(ingrediente1, ingrediente2, ...ingredientes) {
    console.log(ingrediente1);
    console.log(ingrediente2);
    console.log(ingrediente3);
}

var ingredientes = ["Cebolla", "Cubio"];

cocinar(ingrediente, ingredientes);


//Callback

function restar(num1, num2, resta) {
    var resta1 = num1 + num2;
    return resta(resta1);
}

restar(152, 124, function(rresultado) {
    console.log(rresultado);
})