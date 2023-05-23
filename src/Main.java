import exceptions.WrongAccountException;
import exceptions.WrongCurrencyException;
import exceptions.WrongOperationException;

public class Main {

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();

        try {
            bankApplication.process("accountId000", 50, "USD");
        } catch (WrongAccountException e) {
            System.out.println("This account does not exist: " + e);
        } catch (WrongCurrencyException e) {
            System.out.println("There is an account in another currency: " + e);
        } catch (WrongOperationException e) {
            System.out.println("Wrong operation, try again: " + e);
        } catch (Exception e) {
            System.out.println("Error happened, try again: " + e);
        }

        finally {
            System.out.println("Thank you for using our service");
        }

        try {
            bankApplication.process("accountId003", 250, "HRV");
        } catch (WrongAccountException e) {
            System.out.println("This account does not exist: " + e);
        } catch (WrongCurrencyException e) {
            System.out.println("There is an account in another currency: " + e);
        } catch (WrongOperationException e) {
            System.out.println("Wrong operation, try again: " + e);
        } catch (Exception e) {
            System.out.println("Error happened, try again: " + e);
        }

        finally {
            System.out.println("Thank you for using our service");
        }

        try {
            bankApplication.process("accountId001", 50, "EUR");
        } catch (WrongAccountException e) {
            System.out.println("This account does not exist: " + e);
        } catch (WrongCurrencyException e) {
            System.out.println("There is an account in another currency: " + e);
        } catch (WrongOperationException e) {
            System.out.println("Wrong operation, try again: " + e);
        } catch (Exception e) {
            System.out.println("Error happened, try again: " + e);
        }

        finally {
            System.out.println("Thank you for using our service");
        }


        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (WrongAccountException e) {
            System.out.println("This account does not exist: " + e);
        } catch (WrongCurrencyException e) {
            System.out.println("There is an account in another currency: " + e);
        } catch (WrongOperationException e) {
            System.out.println("Wrong operation, try again: " + e);
        } catch (Exception e) {
            System.out.println("Error happened, try again: " + e);
        }

        finally {
            System.out.println("Thank you for using our service");
        }


        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (WrongAccountException e) {
            System.out.println("This account does not exist: " + e);
        } catch (WrongCurrencyException e) {
            System.out.println("There is an account in another currency: " + e);
        } catch (WrongOperationException e) {
            System.out.println("Wrong operation, try again: " + e);
        } catch (Exception e) {
            System.out.println("Error happened, try again: " + e);
        }

        finally {
            System.out.println("Thank you for using our service");
        }

    }
}
