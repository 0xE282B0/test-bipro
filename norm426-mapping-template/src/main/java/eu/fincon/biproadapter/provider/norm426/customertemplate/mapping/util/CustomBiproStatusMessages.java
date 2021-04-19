package eu.fincon.biproadapter.provider.norm426.customertemplate.mapping.util;

import eu.fincon.biproadapter.provider.common.genericapi.util.BiproStatusMessageAware;
import eu.fincon.biproadapter.provider.norm420common.api.enumerations.Norm420CommonBiproStatusMessages;

import net.bipro.namespace.datentypen.STMeldungsart;
import net.bipro.namespace.datentypen.STStatus;

/**
 * For standard BiPRO status messages of Norm 426.
 * @see Norm420CommonBiproStatusMessages
 */
public enum CustomBiproStatusMessages implements BiproStatusMessageAware {

    // Example
    NO_VORGANGSNUMMER_VM("00001",
            "Es wurde keine VorgangsnummerVM übertragen.",
            STStatus.NOK,
            STMeldungsart.FEHLER),;

    private final String xmlCode;
    private final String returnMessage;
    private final STStatus stStatus;
    private final STMeldungsart stMeldungsart;

    CustomBiproStatusMessages(String xmlCode, String returnMessage, STStatus stStatus, STMeldungsart stMeldungsart) {
        this.xmlCode = xmlCode;
        this.returnMessage = returnMessage;
        this.stStatus = stStatus;
        this.stMeldungsart = stMeldungsart;
    }

    @Override
    public STStatus getStatusId() {
        return stStatus;
    }

    @Override
    public String getXmlCode() {
        return xmlCode;
    }

    @Override
    public String getMessage() {
        return returnMessage;
    }

    @Override
    public STMeldungsart getMeldungsArt() {
        return stMeldungsart;
    }
}