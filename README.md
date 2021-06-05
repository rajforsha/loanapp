# loanapp

1. we have multiple commands namely LOAD BALANCE PAYMENT
2. so we have command executor to basically capture all the commands and run it once
3. we have created factory class for all the registered banks so that based on the bank name, we get the bank object and we pass the command to it
4. we are storing all the customer details to a map so that it could easily be retrieved in O(1)
5. we are also storing the customer loan details with respect to every bank so that only that particular bank is aware of the customer and his loan details.
