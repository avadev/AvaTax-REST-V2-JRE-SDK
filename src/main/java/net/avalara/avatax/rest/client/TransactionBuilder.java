package net.avalara.avatax.rest.client;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.models.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.Future;

public class TransactionBuilder {
    private CreateTransactionModel model;
    private int lineNumber;
    private AvaTaxClient client;

    public TransactionBuilder(AvaTaxClient client, String companyCode, DocumentType docType, String customerCode) {
        this.model = new CreateTransactionModel();
        model.setCompanyCode(companyCode);
        model.setCustomerCode(customerCode);
        model.setDate(new Date());
        model.setType(docType);
        model.setLines(new ArrayList<LineItemModel>());
        this.lineNumber = 1;
        this.client = client;
    }

    public TransactionBuilder withCommit() {
        this.model.setCommit(true);
        return this;
    }

    public TransactionBuilder withDiagnostics() {
        this.model.setDebugLevel(TaxDebugLevel.Diagnostic);
        return this;
    }

    public TransactionBuilder withDiscountAmount(BigDecimal discountAmount) {
        this.model.setDiscount(discountAmount);
        return this;
    }

    public TransactionBuilder withItemDiscount(Boolean discounted) {
        getMostRecentLine("WithItemDiscount").setDiscounted(discounted);
        return this;
    }

    public TransactionBuilder withTransactionCode(String code) {
        this.model.setCode(code);
        return this;
    }

    public TransactionBuilder withType(DocumentType type) {
        this.model.setType(type);
        return this;
    }

    public TransactionBuilder withParameter(String name, String value) {
        return this.withParameter(name, value, "");
    }

    public TransactionBuilder withParameter(String name, String value, String unit) {
        ArrayList<TransactionParameterModel> params = this.model.getParameters();

        if (params == null) {
            params = new ArrayList<TransactionParameterModel>();
            this.model.setParameters(params);
        }

        final TransactionParameterModel param = new TransactionParameterModel() {{name = name; value = value; unit = unit;}};
        params.add(param);
        return this;
    }

    public TransactionBuilder withIsSellerImporterOfRecord(Boolean isSellerImporterOfRecord) {
        this.model.setIsSellerImporterOfRecord(isSellerImporterOfRecord);
        return this;
    }

    public TransactionBuilder withLineParameter(String name, String value) {
        return this.withLineParameter(name, value, "");
    }

    public TransactionBuilder withLineParameter(String name, String value, String unit) {
        LineItemModel line = getMostRecentLine("WithLineParameter");
        ArrayList<TransactionLineParameterModel> params = line.getParameters();

        if (params == null) {
            params = new ArrayList<TransactionLineParameterModel>();
            line.setParameters(params);
        }

        final TransactionLineParameterModel param = new TransactionLineParameterModel() {{name = name; value = value; unit = unit;}};
        params.add(param);
        return this;
    }

    public TransactionBuilder withReferenceCode(String referenceCode) {
        this.model.setReferenceCode(referenceCode);
        return this;
    }

    public TransactionBuilder withDate(Date date) {
        model.setDate(date);
        return this;
    }

    public TransactionBuilder withCustomerUsageType(String customerUsageType) {
        model.setCustomerUsageType(customerUsageType);
        return this;
    }

    public TransactionBuilder withExemptionNo(String exemptionNo) {
        model.setExemptionNo(exemptionNo);
        return this;
    }

    public TransactionBuilder withCode(String code) {
        model.setCode(code);
        return this;
    }

    public TransactionBuilder withAddress(TransactionAddressType type, String line1, String line2, String line3, String city, String region, String postalCode, String country) {
        AddressesModel addresses = this.model.getAddresses();

        if (addresses == null) {
            addresses = new AddressesModel();
            this.model.setAddresses(addresses);
        }

        AddressLocationInfo info = new AddressLocationInfo();
        info.setLine1(line1);
        info.setLine2(line2);
        info.setLine3(line3);
        info.setCity(city);
        info.setRegion(region);
        info.setPostalCode(postalCode);
        info.setCountry(country);

        if (type == TransactionAddressType.ShipTo) {
            addresses.setShipTo(info);
        } else if (type == TransactionAddressType.ShipFrom) {
            addresses.setShipFrom(info);
        } else if (type == TransactionAddressType.PointOfOrderAcceptance) {
            addresses.setPointOfOrderAcceptance(info);
        } else if (type == TransactionAddressType.PointOfOrderOrigin) {
            addresses.setPointOfOrderOrigin(info);
        } else if (type == TransactionAddressType.SingleLocation) {
            addresses.setSingleLocation(info);
        }
        
        return this;
    }

    public TransactionBuilder withLatLong(TransactionAddressType type, BigDecimal latitude, BigDecimal longitude) {
        AddressesModel addresses = this.model.getAddresses();

        if (addresses == null) {
            addresses = new AddressesModel();
            this.model.setAddresses(addresses);
        }

        AddressLocationInfo info = new AddressLocationInfo();
        info.setLatitude(latitude);
        info.setLongitude(longitude);

        if (type == TransactionAddressType.ShipTo) {
            addresses.setShipTo(info);
        } else if (type == TransactionAddressType.ShipFrom) {
            addresses.setShipFrom(info);
        } else if (type == TransactionAddressType.PointOfOrderAcceptance) {
            addresses.setPointOfOrderAcceptance(info);
        } else if (type == TransactionAddressType.PointOfOrderOrigin) {
            addresses.setPointOfOrderOrigin(info);
        } else if (type == TransactionAddressType.SingleLocation) {
            addresses.setSingleLocation(info);
        }

        return this;
    }

    public TransactionBuilder withLineAddress(TransactionAddressType type, String line1, String line2, String line3, String city, String region, String postalCode, String country) {
        LineItemModel line = getMostRecentLine("WithLineAddress");
        AddressesModel addresses = line.getAddresses();

        if (addresses == null) {
            addresses = new AddressesModel();
            line.setAddresses(addresses);
        }

        AddressLocationInfo info = new AddressLocationInfo();
        info.setLine1(line1);
        info.setLine2(line2);
        info.setLine3(line3);
        info.setCity(city);
        info.setRegion(region);
        info.setPostalCode(postalCode);
        info.setCountry(country);

        if (type == TransactionAddressType.ShipTo) {
            addresses.setShipTo(info);
        } else if (type == TransactionAddressType.ShipFrom) {
            addresses.setShipFrom(info);
        } else if (type == TransactionAddressType.PointOfOrderAcceptance) {
            addresses.setPointOfOrderAcceptance(info);
        } else if (type == TransactionAddressType.PointOfOrderOrigin) {
            addresses.setPointOfOrderOrigin(info);
        } else if (type == TransactionAddressType.SingleLocation) {
            addresses.setSingleLocation(info);
        }

        return this;
    }

    public TransactionBuilder withTaxOverride(TaxOverrideType type, String reason, BigDecimal taxAmount, Date taxDate) {
        if (taxAmount == null) {
            taxAmount = new BigDecimal(0);
        }

        TaxOverrideModel override = new TaxOverrideModel();
        override.setType(type);
        override.setReason(reason);
        override.setTaxAmount(taxAmount);
        override.setTaxDate(taxDate);

        this.model.setTaxOverride(override);
        return this;
    }

    public TransactionBuilder withLineTaxOverride(TaxOverrideType type, String reason, BigDecimal taxAmount, Date taxDate) throws AvaTaxClientException {
        if (type == TaxOverrideType.TaxDate && taxDate == null) {
            throw new AvaTaxClientException("TaxDate cannot be null with a TaxDate TaxOverrideType.");
        }

        LineItemModel line = getMostRecentLine("WithLineAddress");

        TaxOverrideModel override = new TaxOverrideModel();
        override.setType(type);
        override.setReason(reason);
        override.setTaxAmount(taxAmount);
        override.setTaxDate(taxDate);

        line.setTaxOverride(override);
        return this;
    }

    public TransactionBuilder withLine(String lineNo, BigDecimal amount, BigDecimal quantity, String taxCode) {
        return withLine(lineNo, amount, quantity, taxCode, null, null, null, null);
    }

    public TransactionBuilder withLine(BigDecimal amount, BigDecimal quantity, String taxCode) {
        return withLine(amount, quantity, taxCode, null, null);
    }

    public TransactionBuilder withLine(String lineNo, BigDecimal amount, BigDecimal quantity, String taxCode, String itemCode) {
        return withLine(lineNo, amount, quantity, taxCode, itemCode, null);
    }

    public TransactionBuilder withLine(BigDecimal amount, BigDecimal quantity, String taxCode, String itemCode) {
        return withLine(amount, quantity, taxCode, itemCode, null, null, null, null);
    }

    public TransactionBuilder withLine(String lineNo, BigDecimal amount, BigDecimal quantity, String taxCode, String itemCode, String description) {
        return withLine(lineNo, amount, quantity, taxCode, itemCode, description, null, null);
    }

    public TransactionBuilder withLine(BigDecimal amount, BigDecimal quantity, String taxCode, String itemCode, String description) {
        return withLine(null, amount, quantity, taxCode, itemCode, description, null, null, null, null);
    }

    public TransactionBuilder withLine(String lineNo, BigDecimal amount, BigDecimal quantity, String taxCode, String itemCode, String description, String ref1, String ref2) {
        return withLine(lineNo, amount, quantity, taxCode, itemCode, description, ref1, ref2, null, null);
    }

    public TransactionBuilder withLine(BigDecimal amount, BigDecimal quantity, String taxCode, String itemCode, String description, String ref1, String ref2) {
        return withLine(amount, quantity, taxCode, itemCode, description, ref1, ref2, null);
    }

    public TransactionBuilder withLine(BigDecimal amount, BigDecimal quantity, String taxCode, String itemCode, String description, String ref1, String ref2, String customerUsageType) {
        return withLine(null, amount, quantity, taxCode, itemCode, description, ref1, ref2, customerUsageType, null);
    }

    public TransactionBuilder withLine(String lineNo, BigDecimal amount, BigDecimal quantity, String taxCode, String itemCode, String description, String ref1, String ref2, String customerUsageType, String hsCode) {
        if (quantity == null) {
            quantity = BigDecimal.ONE;
        }

        LineItemModel line = new LineItemModel();
        line.setAmount(amount);
        line.setQuantity(quantity);

        if (lineNo != null && !lineNo.isEmpty()) {
            line.setNumber(lineNo);
        } else {
            line.setNumber(((Integer)this.lineNumber).toString());
        }

        if (taxCode != null && !taxCode.isEmpty()) {
            line.setTaxCode(taxCode);
        } else {
            line.setTaxCode("P0000000");
        }

        if (itemCode != null && !itemCode.isEmpty()) {
            line.setItemCode(itemCode);
        }

        if (description != null && !description.isEmpty()) {
            line.setDescription(description);
        }

        if (ref1 != null && !ref1.isEmpty()) {
            line.setRef1(ref1);
        }

        if (ref2 != null && !ref2.isEmpty()) {
            line.setRef2(ref2);
        }

        if (customerUsageType != null && !customerUsageType.isEmpty()) {
            line.setCustomerUsageType(customerUsageType);
        }

        if(hsCode != null && !hsCode.isEmpty()) {
            line.setHsCode(hsCode);
        }

        this.model.getLines().add(line);
        this.lineNumber++;
        return this;
    }

    public TransactionBuilder withSeparateAddressLine(BigDecimal amount, TransactionAddressType type, String line1, String line2, String line3, String city, String region, String postalCode, String country) {
        return this.withSeparateAddressLineAndQuantity(amount, BigDecimal.ONE, type, line1, line2, line3, city, region, postalCode, country);
    }

    public TransactionBuilder withSeparateAddressLineAndQuantity(BigDecimal amount, BigDecimal quantity, TransactionAddressType type, String line1, String line2, String line3, String city, String region, String postalCode, String country) {
        return this.withSeparateAddressLineQuantityAndItemCode(amount, quantity, null, type, line1, line2, line3, city, region, postalCode, country);
    }

    public TransactionBuilder withSeparateAddressLineQuantityAndItemCode(BigDecimal amount, BigDecimal quantity, String itemCode, TransactionAddressType type, String line1, String line2, String line3, String city, String region, String postalCode, String country) {
        LineItemModel line = new LineItemModel();
        line.setAmount(amount);
        line.setQuantity(quantity);
        line.setNumber(((Integer)this.lineNumber).toString());

        if (itemCode != null && !itemCode.isEmpty()) {
            line.setItemCode(itemCode);
        }

        AddressesModel addresses = new AddressesModel();
        AddressLocationInfo info = new AddressLocationInfo();
        info.setLine1(line1);
        info.setLine2(line2);
        info.setLine3(line3);
        info.setCity(city);
        info.setRegion(region);
        info.setPostalCode(postalCode);
        info.setCountry(country);

        if (type == TransactionAddressType.ShipTo) {
            addresses.setShipTo(info);
        } else if (type == TransactionAddressType.ShipFrom) {
            addresses.setShipFrom(info);
        } else if (type == TransactionAddressType.PointOfOrderAcceptance) {
            addresses.setPointOfOrderAcceptance(info);
        } else if (type == TransactionAddressType.PointOfOrderOrigin) {
            addresses.setPointOfOrderOrigin(info);
        } else if (type == TransactionAddressType.SingleLocation) {
            addresses.setSingleLocation(info);
        }

        line.setAddresses(addresses);

        this.model.getLines().add(line);
        this.lineNumber++;
        return this;
    }

    public TransactionBuilder withExemptLine(BigDecimal amount, String exemptionCode) {
        LineItemModel line = new LineItemModel();
        line.setAmount(amount);
        line.setQuantity(BigDecimal.ONE);
        line.setNumber(((Integer)this.lineNumber).toString());
        line.setExemptionCode(exemptionCode);

        this.model.getLines().add(line);
        this.lineNumber++;
        return this;
    }

    private LineItemModel getMostRecentLine(String methodName) {
        if (this.model.getLines().size() <= 0) {
            throw new IllegalStateException("This transaction does not have any lines.");
        }

        return this.model.getLines().get(this.model.getLines().size() - 1);
    }

    public CreateTransactionModel getIntermediaryTransactionModel() {
        return this.model;
    }

    /*
     * DEPRECATED - use public Future<TransactionModel> createAsync() instead.
     */
    public Future<TransactionModel> CreateAsync() {
        return this.client.createTransactionAsync(null, this.model);
    }

    public Future<TransactionModel> createAsync() {
        return this.client.createTransactionAsync(null, this.model);
    }

    /*
     * DEPRECATED - use public TransactionModel create() instead.
     */
    public TransactionModel Create() throws Exception {
        return this.client.createTransaction(null, this.model);
    }

    public TransactionModel create() throws Exception {
        return this.client.createTransaction(null, this.model);
    }

    /*
     * DEPRECATED - use public AdjustTransactionModel CreateAdjustmentRequest instead.
     */
    public AdjustTransactionModel CreateAdjustmentRequest(String description, AdjustmentReason reason) {
        AdjustTransactionModel adjust = new AdjustTransactionModel();
        adjust.setAdjustmentDescription(description);
        adjust.setAdjustmentReason(reason);
        adjust.setNewTransaction(this.model);
        return adjust;
    }

    public AdjustTransactionModel createAdjustmentRequest(String description, AdjustmentReason reason) {
        AdjustTransactionModel adjust = new AdjustTransactionModel();
        adjust.setAdjustmentDescription(description);
        adjust.setAdjustmentReason(reason);
        adjust.setNewTransaction(this.model);
        return adjust;
    }
}
