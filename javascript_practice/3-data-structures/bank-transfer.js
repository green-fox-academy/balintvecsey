'use strict';

var accounts = [
	{ 'client_name': 'Igor', 'account_number': 11234543, 'balance': 203004099.2 },
	{ 'client_name': 'Vladimir', 'account_number': 43546731, 'balance': 5204100071.23 },
	{ 'client_name': 'Sergei', 'account_number': 23456311, 'balance': 1353600.0 }
]

console.log(accounts);

// Create function that returns the name and balance of cash on an account
function listAccountsNameAndBalance() {
  var listOfAccounts = new Array();

  accounts.forEach(function(element) {
    var account = new Object();
    account.name = element.client_name;
    account.balance = element.balance;

    listOfAccounts.push(account);
  })

  return listOfAccounts;
}

console.log(listAccountsNameAndBalance());

// Create function that transfers an balance of cash from one account to another
// it should have three parameters:
//  - from account_number
//  - to account_number
//  - balance
//
// Log "404 - account not found" if any of the account numbers don't exist to the console.
function transferCash(fromAccountNumber, toAccountNumber, balance) {
  var accountsNumbers = new Array();
  var isContainFrom = false;
  var isContainTo = false;

  for (var account of accounts) {
    if(account.account_number === fromAccountNumber) {
      isContainFrom = true;
      console.log('from is true');
    } else if (account.account_number === toAccountNumber) {
      isContainTo = true;
      console.log('to is true');
    } else {
      console.log('404 - account not found');
    }
  }
}

transferCash(11234543, 11234543, 12);
