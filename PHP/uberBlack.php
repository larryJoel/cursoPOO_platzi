<?php
require_once(Car.php);
class uberBlack extends Car{
    public $typeCarAccepted;
    public $seatsMaterial;

    public function __construct($license, $driver,
    $typeCArAccepted,$seatsMaterial){
        parent::__construct($license,$driver);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    }
}

?>