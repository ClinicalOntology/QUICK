package org.reimagineehr.model.quick.utils;

import java.util.ArrayList;
import java.util.List;

public class Stu3Utils {

    public static org.hl7.fhir.dstu3.model.CodeableConcept getAsFhirCodeableConcept(org.reimagineehr.model.quick.api.datatype.CodeableConcept codeableConcept) {
        org.hl7.fhir.dstu3.model.CodeableConcept fhirCodeableConcept = new org.hl7.fhir.dstu3.model.CodeableConcept();
        fhirCodeableConcept.setText(codeableConcept.getText());
        fhirCodeableConcept.setCoding(getAsFhirCoding(codeableConcept.getCoding()));
        return fhirCodeableConcept;
    }

    public static List<org.hl7.fhir.dstu3.model.CodeableConcept> getAsFhirCodeableConcept(List<org.reimagineehr.model.quick.api.datatype.CodeableConcept> codeableConceptList) {
        List<org.hl7.fhir.dstu3.model.CodeableConcept> codeableConcepts = new ArrayList<>();
        codeableConceptList.forEach(item -> {
            codeableConcepts.add(getAsFhirCodeableConcept(item));
        });
        return codeableConcepts;
    }

    public static org.reimagineehr.model.quick.api.datatype.CodeableConcept getAsQuickCodeableConcept(org.hl7.fhir.dstu3.model.CodeableConcept codeableConcept) {
        org.reimagineehr.model.quick.api.datatype.CodeableConcept quickCodeableConcept = new org.reimagineehr.model.quick.impl.datatype.CodeableConceptImpl();
        quickCodeableConcept.setText(codeableConcept.getText());
        quickCodeableConcept.setCoding(getAsQuickCoding(codeableConcept.getCoding()));
        return quickCodeableConcept;
    }

    public static List<org.reimagineehr.model.quick.api.datatype.CodeableConcept> getAsQuickCodeableConcept(List<org.hl7.fhir.dstu3.model.CodeableConcept> codeableConceptList) {
        List<org.reimagineehr.model.quick.api.datatype.CodeableConcept> codeableConcepts = new ArrayList<>();
        codeableConceptList.forEach(item -> {
            codeableConcepts.add(getAsQuickCodeableConcept(item));
        });
        return codeableConcepts;
    }

    public static org.hl7.fhir.dstu3.model.Coding getAsFhirCoding(org.reimagineehr.model.quick.api.datatype.Coding coding) {
        org.hl7.fhir.dstu3.model.Coding fhirCoding = new org.hl7.fhir.dstu3.model.Coding(coding.getSystem(), coding.getCode(), coding.getDisplay());
        fhirCoding.setVersion(coding.getVersion());
        return fhirCoding;
    }

    public static List<org.hl7.fhir.dstu3.model.Coding> getAsFhirCoding(List<org.reimagineehr.model.quick.api.datatype.Coding> codingList) {
        List<org.hl7.fhir.dstu3.model.Coding> codings = new ArrayList<>();
        codingList.forEach(item -> {
            codings.add(getAsFhirCoding(item));
        });
        return codings;
    }

    public static org.reimagineehr.model.quick.api.datatype.Coding getAsQuickCoding(org.hl7.fhir.dstu3.model.Coding coding) {
        org.reimagineehr.model.quick.api.datatype.Coding quickCoding = new org.reimagineehr.model.quick.impl.datatype.CodingImpl();
        quickCoding.setSystem(coding.getSystem());
        quickCoding.setCode(coding.getCode());
        quickCoding.setDisplay(coding.getDisplay());
        quickCoding.setUserSelected(coding.getUserSelected());
        quickCoding.setVersion(coding.getVersion());
        return quickCoding;
    }

    public static List<org.reimagineehr.model.quick.api.datatype.Coding> getAsQuickCoding(List<org.hl7.fhir.dstu3.model.Coding> coding) {
        List<org.reimagineehr.model.quick.api.datatype.Coding> codingList = new ArrayList<>();
        coding.forEach(item -> {
            codingList.add(getAsQuickCoding(item));
        });
        return codingList;
    }
}
