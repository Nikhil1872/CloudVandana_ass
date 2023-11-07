let currentInput = '';
let currentOperator = '';
let previousInput = '';

function appendToDisplay(value) {
    currentInput += value;
    document.getElementById('display').value = currentInput;
}

function appendOperator(operator) {
    if (currentInput === '') return;
    if (currentOperator !== '') {
        calculateResult();
    }
    currentOperator = operator;
    previousInput = currentInput;
    currentInput = '';
}

function calculateResult() {
    if (currentInput === '') return;

    let result;
    const num1 = parseFloat(previousInput);
    const num2 = parseFloat(currentInput);

    switch (currentOperator) {
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            if (num2 === 0) {
                result = 'Error';
            } else {
                result = num1 / num2;
            }
            break;
    }

    document.getElementById('display').value = result;
    currentInput = result;
    currentOperator = '';
    previousInput = '';
}

function clearDisplay() {
    currentInput = '';
    currentOperator = '';
    previousInput = '';
    document.getElementById('display').value = '';
}
