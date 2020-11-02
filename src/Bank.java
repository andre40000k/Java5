import java.io.Serializable;
import java.util.Comparator;

public class Bank implements Serializable
{

    private String bANK;
    private String iFSC;
    private String bRANCH;
    private String aDDRESS;
    private String cONTACT;
    private String cITY;
    private String dISTRICT;
    private String sTATE;
    private boolean rTGS;
    private String bANKCODE;
    private final static long serialVersionUID = 22648362965660707L;


    public Bank(String bANK, String iFSC, String bRANCH, String aDDRESS, String cONTACT, String cITY, String dISTRICT, String sTATE, boolean rTGS, String bANKCODE) {
        this.bANK = bANK;
        this.iFSC = iFSC;
        this.bRANCH = bRANCH;
        this.aDDRESS = aDDRESS;
        this.cONTACT = cONTACT;
        this.cITY = cITY;
        this.dISTRICT = dISTRICT;
        this.sTATE = sTATE;
        this.rTGS = rTGS;
        this.bANKCODE = bANKCODE;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bANK='" + bANK + '\'' +
                ", iFSC='" + iFSC + '\'' +
                ", bRANCH='" + bRANCH + '\'' +
                ", aDDRESS='" + aDDRESS + '\'' +
                ", cONTACT='" + cONTACT + '\'' +
                ", cITY='" + cITY + '\'' +
                ", dISTRICT='" + dISTRICT + '\'' +
                ", sTATE='" + sTATE + '\'' +
                ", rTGS=" + rTGS +
                ", bANKCODE='" + bANKCODE + '\'' +
                '}';
    }

    public static Comparator<Bank> byIdAsc = Comparator.comparing(o -> o.bANK);


    public String getBANK() {
        return bANK;
    }

    public void setBANK(String bANK) {
        this.bANK = bANK;
    }

    public String getIFSC() {
        return iFSC;
    }

    public void setIFSC(String iFSC) {
        this.iFSC = iFSC;
    }

    public String getBRANCH() {
        return bRANCH;
    }

    public void setBRANCH(String bRANCH) {
        this.bRANCH = bRANCH;
    }

    public String getADDRESS() {
        return aDDRESS;
    }

    public void setADDRESS(String aDDRESS) {
        this.aDDRESS = aDDRESS;
    }

    public String getCONTACT() {
        return cONTACT;
    }

    public void setCONTACT(String cONTACT) {
        this.cONTACT = cONTACT;
    }

    public String getCITY() {
        return cITY;
    }

    public void setCITY(String cITY) {
        this.cITY = cITY;
    }

    public String getDISTRICT() {
        return dISTRICT;
    }

    public void setDISTRICT(String dISTRICT) {
        this.dISTRICT = dISTRICT;
    }

    public String getSTATE() {
        return sTATE;
    }

    public void setSTATE(String sTATE) {
        this.sTATE = sTATE;
    }

    public boolean isRTGS() {
        return rTGS;
    }

    public void setRTGS(boolean rTGS) {
        this.rTGS = rTGS;
    }

    public String getBANKCODE() {
        return bANKCODE;
    }

    public void setBANKCODE(String bANKCODE) {
        this.bANKCODE = bANKCODE;
    }

}
