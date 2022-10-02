public class Car {
    //private Integer id;
    private String license;
    private Account driver;
    private Integer passegenger;
    

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
        //System.out.println("pasajeros: "+passegenger);
    }


    void printDataCar(){
        if(passegenger != null)
            System.out.println("License: "+license + " Drivers: "+driver.name+" Cantidad de pasajeros: "+passegenger);
    }

    public Integer getPassenger(){
        return passegenger;
    }

    public void setPassenger(Integer passegenger){
        if(passegenger == 4){
            this.passegenger = passegenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }


    public String getLicense() {
        return license;
    }


    public void setLicense(String license) {
        this.license = license;
    }


    public Account getDriver() {
        return driver;
    }


    public void setDriver(Account driver) {
        this.driver = driver;
    }

}
