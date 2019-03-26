package com.gzeinnumer.antrianperawat;

class DataAntrian {
    private int antrianNo;
    private String antrianNama;
    private String antrianAalamat;

    public DataAntrian(int antrianNo, String antrianNama, String antrianAalamat) {
        this.antrianNo = antrianNo;
        this.antrianNama = antrianNama;
        this.antrianAalamat = antrianAalamat;
    }

    public int getAntrianNo() {
        return antrianNo;
    }

    public void setAntrianNo(int antrianNo) {
        this.antrianNo = antrianNo;
    }

    public String getAntrianNama() {
        return antrianNama;
    }

    public void setAntrianNama(String antrianNama) {
        this.antrianNama = antrianNama;
    }

    public String getAntrianAalamat() {
        return antrianAalamat;
    }

    public void setAntrianAalamat(String antrianAalamat) {
        this.antrianAalamat = antrianAalamat;
    }
}
