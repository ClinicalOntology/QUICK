package org.reimagineehr.model.quick.r4.utils;

import org.reimagineehr.model.quick.r4.wrapper.datatype.SimpleQuantityWrapper;

import java.util.ArrayList;
import java.util.List;

public class R4Utils {

    public static org.hl7.fhir.r4.model.CodeableConcept getAsFhirCodeableConcept(org.reimagineehr.model.quick.api.datatype.CodeableConcept codeableConcept) {
        org.hl7.fhir.r4.model.CodeableConcept fhirCodeableConcept = new org.hl7.fhir.r4.model.CodeableConcept();
        fhirCodeableConcept.setText(codeableConcept.getText());
        fhirCodeableConcept.setCoding(getAsFhirCoding(codeableConcept.getCoding()));
        return fhirCodeableConcept;
    }

    public static List<org.hl7.fhir.r4.model.CodeableConcept> getAsFhirCodeableConcept(List<org.reimagineehr.model.quick.api.datatype.CodeableConcept> codeableConceptList) {
        List<org.hl7.fhir.r4.model.CodeableConcept> codeableConcepts = new ArrayList<>();
        codeableConceptList.forEach(item -> {
            codeableConcepts.add(getAsFhirCodeableConcept(item));
        });
        return codeableConcepts;
    }

    public static org.reimagineehr.model.quick.api.datatype.CodeableConcept getAsQuickCodeableConcept(org.hl7.fhir.r4.model.CodeableConcept codeableConcept) {
        org.reimagineehr.model.quick.api.datatype.CodeableConcept quickCodeableConcept = new org.reimagineehr.model.quick.impl.datatype.CodeableConceptImpl();
        quickCodeableConcept.setText(codeableConcept.getText());
        quickCodeableConcept.setCoding(getAsQuickCoding(codeableConcept.getCoding()));
        return quickCodeableConcept;
    }

    public static List<org.reimagineehr.model.quick.api.datatype.CodeableConcept> getAsQuickCodeableConcept(List<org.hl7.fhir.r4.model.CodeableConcept> codeableConceptList) {
        List<org.reimagineehr.model.quick.api.datatype.CodeableConcept> codeableConcepts = new ArrayList<>();
        codeableConceptList.forEach(item -> {
            codeableConcepts.add(getAsQuickCodeableConcept(item));
        });
        return codeableConcepts;
    }

    public static org.hl7.fhir.r4.model.Coding getAsFhirCoding(org.reimagineehr.model.quick.api.datatype.Coding coding) {
        org.hl7.fhir.r4.model.Coding fhirCoding = new org.hl7.fhir.r4.model.Coding(coding.getSystem(), coding.getCode(), coding.getDisplay());
        fhirCoding.setVersion(coding.getVersion());
        return fhirCoding;
    }

    public static List<org.hl7.fhir.r4.model.Coding> getAsFhirCoding(List<org.reimagineehr.model.quick.api.datatype.Coding> codingList) {
        List<org.hl7.fhir.r4.model.Coding> codings = new ArrayList<>();
        codingList.forEach(item -> {
            codings.add(getAsFhirCoding(item));
        });
        return codings;
    }

    public static org.reimagineehr.model.quick.api.datatype.Coding getAsQuickCoding(org.hl7.fhir.r4.model.Coding coding) {
        org.reimagineehr.model.quick.api.datatype.Coding quickCoding = new org.reimagineehr.model.quick.impl.datatype.CodingImpl();
        quickCoding.setSystem(coding.getSystem());
        quickCoding.setCode(coding.getCode());
        quickCoding.setDisplay(coding.getDisplay());
        quickCoding.setUserSelected(coding.getUserSelected());
        quickCoding.setVersion(coding.getVersion());
        return quickCoding;
    }

    public static List<org.reimagineehr.model.quick.api.datatype.Coding> getAsQuickCoding(List<org.hl7.fhir.r4.model.Coding> coding) {
        List<org.reimagineehr.model.quick.api.datatype.Coding> codingList = new ArrayList<>();
        coding.forEach(item -> {
            codingList.add(getAsQuickCoding(item));
        });
        return codingList;
    }

    public static org.reimagineehr.model.quick.api.datatype.SimpleQuantity convertQuantityToSimpleQuantityWrapper(org.hl7.fhir.r4.model.Quantity quantity) {
        if(quantity != null) {
            org.reimagineehr.model.quick.r4.wrapper.datatype.SimpleQuantityWrapper returnValue = new org.reimagineehr.model.quick.r4.wrapper.datatype.SimpleQuantityWrapper();
            org.hl7.fhir.r4.model.SimpleQuantity adaptee = new org.hl7.fhir.r4.model.SimpleQuantity();
            adaptee.setCode(quantity.getCode());
            adaptee.setValue(quantity.getValue());
            adaptee.setUnit(quantity.getUnit());
            adaptee.setExtension(quantity.getExtension());
            returnValue.setAdaptee(adaptee);
            return returnValue;
        } else {
            return null;
        }
    }

    public static org.hl7.fhir.r4.model.Quantity convertSimpleQuantityWrapperToQuantity(org.reimagineehr.model.quick.api.datatype.SimpleQuantity simpleQuantityWrapper) {
        if(simpleQuantityWrapper != null && ((SimpleQuantityWrapper)simpleQuantityWrapper).getAdaptee() != null) {
            org.hl7.fhir.r4.model.Quantity returnValue = new org.hl7.fhir.r4.model.Quantity();
            returnValue.setCode(((SimpleQuantityWrapper)simpleQuantityWrapper).getAdaptee().getCode());
            returnValue.setValue(((SimpleQuantityWrapper)simpleQuantityWrapper).getAdaptee().getValue());
            returnValue.setUnit(((SimpleQuantityWrapper)simpleQuantityWrapper).getAdaptee().getUnit());
            returnValue.setExtension(((SimpleQuantityWrapper)simpleQuantityWrapper).getAdaptee().getExtension());
            return returnValue;
        } else {
            return null;
        }

    }
}
