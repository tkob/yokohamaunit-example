package yokohama.unit.example.gs_collections_kata;

import com.gs.collections.kata.Company;

public class Domain extends com.gs.collections.kata.CompanyDomainForKata {
    public Domain() {
        this.setUp();
    }

    public static Company getCompany() {
        return new Domain().company;
    }
}

