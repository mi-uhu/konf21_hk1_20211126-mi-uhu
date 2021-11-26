package org.campus02.change_me;

public class Account {
    private String owner;
    private double amount;

    public Account(String accountOwner) {
        // TODO: Das Attribut owner muss mit dem Wert des Parameters accountOwner initialisiert werden

        // TODO: Das Attribut amount muss mit dem Wert 100.0 initialisiert werden
    }

    public void credit(double value) {
        // TODO: Der Betrag value soll auf den verfuegbaren Betrag amount aufgebucht werden (amount um value erhoehen)
    }

    public boolean debit (double value) {
        /* Diese Methode überprüft, ob der Wert vollständig abgebucht werden kann.
            ja: Wenn ja, wird der Wert abgebucht und true retourniert.
            nein: Wenn der Betrag nicht vollständig abgebucht werden kann,
                wird der verfügbare Betrag nicht geändert und false retourniert. */

        if (amount > value) {
            amount = amount - value;
            return true;
        }
        else {
            amount = amount - value;
            return false;
        }
    }

    public String getOwner() {
        return owner;
    }

    public double getAmount() {
        return amount;
    }
}
