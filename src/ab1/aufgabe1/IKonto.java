package ab1.aufgabe1;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * ALP III - Julian
 * <p/>
 * User: Baka
 * Date: 24.10.12
 * Time: 17:02
 * To change this template use File | Settings | File Templates.
 */
public interface IKonto {

    /**
     * represents the account number. Must be set by ctor
     */
    public String kontonummer = null;

    /**
     * Represents the current account balance. We have to use the datatype
     * {BigDecimal} to avoid rounding errors as much as possible
     */
    public BigDecimal kontostand = new BigDecimal(0);

    /**
     * represent the bank account owner. Must be set by ctor
     */
    public String inhaber = null;

    /**
     *  represent the bank code. Must be set by ctor
     */
    public int blz = 0;

    /**
     * Rise the balance of this account.
     * @param betrag to be added to the account. Must be positive
     * @throws BetragNotPositiveException rises when betrag is not positive
     */
    public void einzahlen(BigDecimal betrag)
        throws BetragNotPositiveException;

    /**
     * removes an given amount of money from the account
     * @param betrag to be removed from the account. The account balance
     *               must not be negative
     * @throws AccountBalanceNegativeException rises when the account
     * balance got negative through this operation
     */
    public void auszahlen(BigDecimal betrag)
        throws AccountBalanceNegativeException;

    /**
     * gives the current Kontostand
      * @return the current Kontostand
     */
    public BigDecimal getKontostand();
}
