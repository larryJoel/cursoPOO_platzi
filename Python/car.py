class Car:
    id          = int
    license     = chr
    driver      = chr
    passegenger = int

    def __init__(self, license, driver):
        self.license    = license
        self.driver     = driver