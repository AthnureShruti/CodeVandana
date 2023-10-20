window.onload = function () {
  let display = document.getElementById("display");

  function appendToDisplay(value) {
    if (
      display.textContent === "0" &&
      value !== "." &&
      value !== "+" &&
      value !== "-" &&
      value !== "*" &&
      value !== "/"
    ) {
      display.textContent = "";
    }
    display.textContent += value;
  }

  function clearDisplay() {
    display.textContent = "0";
  }

  function calculateResult() {
    try {
      display.textContent = eval(display.textContent);
    } catch (error) {
      display.textContent = "Error";
    }
  }
};
