package ru.mirea.lab19;

public class Client {
    private String fullName;
    private String inn;
    public Client(String fullName, String inn) throws InvalidINN{
        if (!isValidInn(inn)){
            throw new InvalidINN("ИНН недействителен!!!");
        }
        else{
            this.fullName = fullName;
            this.inn = inn;
        }
    }
    private boolean isValidInn(String inn) {
        if (inn == null) return false;
        return inn.matches("\\d{10}") || inn.matches("\\d{12}");
    }
    @Override
    public String toString(){
        return "Клиент " + fullName + " с ИНН " + inn;
    }

    public static void main(String[] args) {
        try {
            Client c1 = new Client("Изирбеков А.М", "7736207543");
            System.out.println(c1);
        }catch (InvalidINN e){
            System.err.println("Ошибка: " + e.getMessage());
        }
        try {
            Client c2 = new Client("Иванов И.И", "773620723424234234543");
            System.out.println(c2);
        }catch (InvalidINN e){
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
