def call(Map config = [:]){
  echo "Hello ${config.name}, today is ${config.day}"
}

def add(num1, num2){
  echo "Sum of ${num1} and ${num2} is ${num1+num2}"
}
