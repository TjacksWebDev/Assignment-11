# Assignment-11
Online Banking app


Your job in this assignment will be to make an online banking account history viewer.

Note: When you check-out the GitHub Repo (via https://github.com/CodersCampus/Assignment11starter) you will notice that within the TransactionRepository, it has code to populate a List of Transactions with data when the Repository is created on startup.

I’d recommend checking out the code onto your local machine, creating a controller with a /transactions endpoint that points to the existing transactions.html view, then booting up the application, and navigating to http://localhost:8080/transactions to see a static example of the page. You’ll notice that the table has four transactions “hard-coded” into it for demonstration purposes.

Given that your TransactionRepository will be populated with data automatically, your next task is to create two webpages via the following URLs:


http://localhost:8080/transactions
http://localhost:8080/transactions/{transactionId}

The first page will be used to view all 100 transactions that are stored in your repository.

Here’s an example of the output that you’ll need to create:


![image](https://github.com/TjacksWebDev/Assignment-11/assets/143833425/16de58bb-840f-4f05-84e7-bd797d5e28f8)


Note: You will need to list the transactions in sorted ascending order (by date).

You should also note that the IDs for each transaction is clickable. When one of them is clicked it will navigate to the second URL (mentioned above).

Here’s what the second webpage should look like when you click on Transaction ID 50:
![image](https://github.com/TjacksWebDev/Assignment-11/assets/143833425/a40e8571-3a7d-42eb-b2fb-c757dd13d470)

Here’s another example of what the second webpage should look like when you click on Transaction ID 38:


![image](https://github.com/TjacksWebDev/Assignment-11/assets/143833425/b06b03c8-df4d-404a-b4c3-ebd12d5dc945)

Be sure to use proper design principles when creating your code.

You should have a Controller, a Service and a Repository with properly named methods (just as we’ve seen in this week’s lessons).
