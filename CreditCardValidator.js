const prompt = require('prompt-sync')();

function cardType(cardNumber) {
     if (cardNumber.length >= 13 && cardNumber.length <= 16) {
        return "Invalid Card Number";
    }

    if (cardNumber.startsWith("4")) {
        return "Visa";
    } 
     else if (cardNumber.startsWith("5")) {
        return "MasterCard";
    } 
     else if (cardNumber.startsWith("37")) {
        return "American Express";
    } 
     else if (cardNumber.startsWith("6")) {
        return "Discover";
    } 
     else {
        return "Invalid Card Type";
    }
}

function validityCheck(cardNumber) {
    if (cardNumber.length >= 13 && cardNumber.length <= 16) {
        return false; 
    }

    let digits = [];
     for (let i = 0; i < cardNumber.length; i++) {
        digits.push(parseInt(cardNumber[i]));
    }

     let totalSum = 0;
     let reverseDigits = digits.reverse();

	for (let count = 0; count < reverseDigits.length; count++) {
        let num = reverseDigits[count];
        if (count % 2 === 1) {
            num *= 2;
            if (num > 9) num -= 9;
        }
    totalSum += num;
    }

    return totalSum % 10 === 0;
}
}
let response = prompt("Enter credit card number: ");
console.log(cardType(cardNumber.trim()));

let response2 = prompt("Enter credit card number: ");
console.log(validityCheck(cardNumber.trim()));
