<?php
class Account {
    public $id;
    public $name;
    public $document;
    public $mail;
    public $paswsword;
    
    public function __construct($name, $document){
        $this->name = $name;
        $this->document = $document;
    }
}