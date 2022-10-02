class Main {
    public static void main(String[] args) {
        // System.out.print("Hola mundo  ");
        UberX uberX = new UberX("AMQ123", new Account("Andrés Herrera", "AND123"),"Chevrolet","Sonic");
        //uberX.passegenger = 5;
        uberX.setPassenger(4);
        uberX.printDataCar();
        
        UberVan uberVan = new UberVan("XXX99", new Account("Jose Medina", "11159753"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
        //Car car2 = new Car("QWSA1245", new Account("Heyzelle González", "ADE154"));
       // car.passegenger = 5;
       // car2.printDataCar();
    }
}