package model;

public class contract_detail {
    private int contract_deteails_id;
    private int contrac_id;
    private int attach_service_id;
    private int quality;

    public contract_detail(int contract_deteails_id, int contrac_id, int attach_service_id, int quality) {
        this.contract_deteails_id = contract_deteails_id;
        this.contrac_id = contrac_id;
        this.attach_service_id = attach_service_id;
        this.quality = quality;
    }

    public contract_detail(){}

    public int getContract_deteails_id() {
        return contract_deteails_id;
    }

    public void setContract_deteails_id(int contract_deteails_id) {
        this.contract_deteails_id = contract_deteails_id;
    }

    public int getContrac_id() {
        return contrac_id;
    }

    public void setContrac_id(int contrac_id) {
        this.contrac_id = contrac_id;
    }

    public int getAttach_service_id() {
        return attach_service_id;
    }

    public void setAttach_service_id(int attach_service_id) {
        this.attach_service_id = attach_service_id;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
