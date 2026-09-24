class ArduinoUnoCatalog:
    # Pines digitales validos (0 al 13) como strings
    DIGITAL_PINS = {str(i) for i in range(14)}
    
    # Pines analogicos validos (A0 al A5)
    ANALOG_PINS = {f"A{i}" for i in range(6)}
    
    # Pines mapeados con funcion Serial RX/TX (requieren advertencia)
    SERIAL_PINS = {"0", "1"}

    @classmethod
    def is_valid_pin(cls, pin_value: str, pin_type: str) -> bool:
        """Verifica si el numero o nombre de pin existe en el hardware segun su tipo."""
        if pin_type == "digital":
            return pin_value in cls.DIGITAL_PINS
        elif pin_type == "analog":
            return pin_value in cls.ANALOG_PINS
        return False

    @classmethod
    def is_serial_pin(cls, pin_value: str) -> bool:
        """Retorna True si el pin interfiere con la comunicacion UART/Serial."""
        return pin_value in cls.SERIAL_PINS