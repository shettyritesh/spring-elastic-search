package com.pc.spring.data.es.model;

import static org.springframework.data.elasticsearch.annotations.FieldIndex.not_analyzed;
import static org.springframework.data.elasticsearch.annotations.FieldType.String;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
@Document(indexName = "plans", type = "plan")
public class Plan {

    @Id
    private String id;

    @JsonProperty("ACK_ID")
    @Field(type = String, index = not_analyzed)
    private String ackId;
    
    
    @JsonProperty("FORM_PLAN_YEAR_BEGIN_DATE")  
    private String Form_Plan_Year_Begin_Date;
    @JsonProperty("FORM_TAX_PRD")  
    private String Form_Tax_Prd;
    @JsonProperty("TYPE_PLAN_ENTITY_CD")  
    private String Type_Plan_Entity_Cd;
    @JsonProperty("TYPE_DFE_PLAN_ENTITY_CD")  
    private String Type_Dfe_Plan_Entity_Cd;
    @JsonProperty("INITIAL_FILING_IND")  
    private String Initial_Filing_Ind;
    @JsonProperty("AMENDED_IND")  
    private String Amended_Ind;
    @JsonProperty("FINAL_FILING_IND")  
    private String Final_Filing_Ind;
    @JsonProperty("SHORT_PLAN_YR_IND")  
    private String Short_Plan_Yr_Ind;
    @JsonProperty("COLLECTIVE_BARGAIN_IND")  
    private String Collective_Bargain_Ind;
    @JsonProperty("F5558_APPLICATION_FILED_IND")  
    private String F5558_Application_Filed_Ind;
    @JsonProperty("EXT_AUTOMATIC_IND")  
    private String Ext_Automatic_Ind;
    @JsonProperty("DFVC_PROGRAM_IND")  
    private String Dfvc_Program_Ind;
    @JsonProperty("EXT_SPECIAL_IND")  
    private String Ext_Special_Ind;
    @JsonProperty("EXT_SPECIAL_TEXT")  
    private String Ext_Special_Text;
    
    @JsonProperty("SPONS_DFE_PN")  
    private String Spons_Dfe_Pn;
    @JsonProperty("PLAN_EFF_DATE")  
    private String Plan_Eff_Date;
    
    @Field(type=String ,index=FieldIndex.analyzed)
    @JsonProperty("SPONSOR_DFE_NAME")
    private String sponsorDfeName;   
    @JsonProperty("SPONS_DFE_DBA_NAME")  
    private String Spons_Dfe_Dba_Name;
    @JsonProperty("SPONS_DFE_CARE_OF_NAME")  
    private String Spons_Dfe_Care_Of_Name;
    @JsonProperty("SPONS_DFE_MAIL_US_ADDRESS1")  
    private String Spons_Dfe_Mail_Us_Address1;
    @JsonProperty("SPONS_DFE_MAIL_US_ADDRESS2")  
    private String Spons_Dfe_Mail_Us_Address2;
    @JsonProperty("SPONS_DFE_MAIL_US_CITY")  
    private String Spons_Dfe_Mail_Us_City;
    @JsonProperty("SPONS_DFE_MAIL_US_STATE")  
    private String Spons_Dfe_Mail_Us_State;    
    @JsonProperty("SPONS_DFE_MAIL_US_ZIP")  
    private String Spons_Dfe_Mail_Us_Zip;
    @JsonProperty("SPONS_DFE_MAIL_FOREIGN_ADDR1")  
    private String Spons_Dfe_Mail_Foreign_Addr1;
    @JsonProperty("SPONS_DFE_MAIL_FOREIGN_ADDR2")  
    private String Spons_Dfe_Mail_Foreign_Addr2;
    @JsonProperty("SPONS_DFE_MAIL_FOREIGN_CITY")  
    private String Spons_Dfe_Mail_Foreign_City;
    @JsonProperty("SPONS_DFE_MAIL_FORGN_PROV_ST")  
    private String Spons_Dfe_Mail_Forgn_Prov_St;
    @JsonProperty("SPONS_DFE_MAIL_FOREIGN_CNTRY")  
    private String Spons_Dfe_Mail_Foreign_Cntry;
    @JsonProperty("SPONS_DFE_MAIL_FORGN_POSTAL_CD")  
    private String Spons_Dfe_Mail_Forgn_Postal_Cd;
    @JsonProperty("SPONS_DFE_LOC_US_ADDRESS1")  
    private String Spons_Dfe_Loc_Us_Address1;
    @JsonProperty("SPONS_DFE_LOC_US_ADDRESS2")  
    private String Spons_Dfe_Loc_Us_Address2;
    @JsonProperty("SPONS_DFE_LOC_US_CITY")  
    private String Spons_Dfe_Loc_Us_City;
    
    @Field(type=String ,index=not_analyzed)
    @JsonProperty("SPONS_DFE_LOC_US_STATE")  
    private String Spons_Dfe_Loc_Us_State;
    @JsonProperty("SPONS_DFE_LOC_US_ZIP")  
    private String Spons_Dfe_Loc_Us_Zip;
    @JsonProperty("SPONS_DFE_LOC_FOREIGN_ADDRESS1")  
    private String Spons_Dfe_Loc_Foreign_Address1;
    @JsonProperty("SPONS_DFE_LOC_FOREIGN_ADDRESS2")  
    private String Spons_Dfe_Loc_Foreign_Address2;
    @JsonProperty("SPONS_DFE_LOC_FOREIGN_CITY")  
    private String Spons_Dfe_Loc_Foreign_City;
    @JsonProperty("SPONS_DFE_LOC_FORGN_PROV_ST")  
    private String Spons_Dfe_Loc_Forgn_Prov_St;
    @JsonProperty("SPONS_DFE_LOC_FOREIGN_CNTRY")  
    private String Spons_Dfe_Loc_Foreign_Cntry;
    @JsonProperty("SPONS_DFE_LOC_FORGN_POSTAL_CD")  
    private String Spons_Dfe_Loc_Forgn_Postal_Cd;
    @JsonProperty("SPONS_DFE_EIN")  
    private String Spons_Dfe_Ein;
    @JsonProperty("SPONS_DFE_PHONE_NUM")  
    private String Spons_Dfe_Phone_Num;
    @JsonProperty("BUSINESS_CODE")  
    private String Business_Code;
    @JsonProperty("ADMIN_NAME")  
    private String Admin_Name;
    @JsonProperty("ADMIN_CARE_OF_NAME")  
    private String Admin_Care_Of_Name;
    @JsonProperty("ADMIN_US_ADDRESS1")  
    private String Admin_Us_Address1;
    @JsonProperty("ADMIN_US_ADDRESS2")  
    private String Admin_Us_Address2;
    @JsonProperty("ADMIN_US_CITY")  
    private String Admin_Us_City;
    @JsonProperty("ADMIN_US_STATE")  
    private String Admin_Us_State;
    @JsonProperty("ADMIN_US_ZIP")  
    private String Admin_Us_Zip;
    @JsonProperty("ADMIN_FOREIGN_ADDRESS1")  
    private String Admin_Foreign_Address1;
    @JsonProperty("ADMIN_FOREIGN_ADDRESS2")  
    private String Admin_Foreign_Address2;
    @JsonProperty("ADMIN_FOREIGN_CITY")  
    private String Admin_Foreign_City;
    @JsonProperty("ADMIN_FOREIGN_PROV_STATE")  
    private String Admin_Foreign_Prov_State;
    @JsonProperty("ADMIN_FOREIGN_CNTRY")  
    private String Admin_Foreign_Cntry;
    @JsonProperty("ADMIN_FOREIGN_POSTAL_CD")  
    private String Admin_Foreign_Postal_Cd;
    @JsonProperty("ADMIN_EIN")  
    private String Admin_Ein;
    @JsonProperty("ADMIN_PHONE_NUM")  
    private String Admin_Phone_Num;
    @JsonProperty("LAST_RPT_SPONS_NAME")  
    private String Last_Rpt_Spons_Name;
    @JsonProperty("LAST_RPT_SPONS_EIN")  
    private String Last_Rpt_Spons_Ein;
    @JsonProperty("LAST_RPT_PLAN_NUM")  
    private String Last_Rpt_Plan_Num;
    @JsonProperty("ADMIN_SIGNED_DATE")  
    private String Admin_Signed_Date;
    @JsonProperty("ADMIN_SIGNED_NAME")  
    private String Admin_Signed_Name;
    @JsonProperty("SPONS_SIGNED_DATE")  
    private String Spons_Signed_Date;
    @JsonProperty("SPONS_SIGNED_NAME")  
    private String Spons_Signed_Name;
    @JsonProperty("DFE_SIGNED_DATE")  
    private String Dfe_Signed_Date;
    @JsonProperty("DFE_SIGNED_NAME")  
    private String Dfe_Signed_Name;
    @JsonProperty("TOT_PARTCP_BOY_CNT")  
    private Integer Tot_Partcp_Boy_Cnt;
    @JsonProperty("TOT_ACTIVE_PARTCP_CNT")  
    private Integer Tot_Active_Partcp_Cnt;
    @JsonProperty("RTD_SEP_PARTCP_RCVG_CNT")  
    private Integer Rtd_Sep_Partcp_Rcvg_Cnt;
    @JsonProperty("RTD_SEP_PARTCP_FUT_CNT")  
    private Integer Rtd_Sep_Partcp_Fut_Cnt;
    @JsonProperty("SUBTL_ACT_RTD_SEP_CNT")  
    private Integer Subtl_Act_Rtd_Sep_Cnt;
    @JsonProperty("BENEF_RCVG_BNFT_CNT")  
    private Integer Benef_Rcvg_Bnft_Cnt;
    @JsonProperty("TOT_ACT_RTD_SEP_BENEF_CNT")  
    private Integer Tot_Act_Rtd_Sep_Benef_Cnt;
    @JsonProperty("PARTCP_ACCOUNT_BAL_CNT")  
    private Integer Partcp_Account_Bal_Cnt;
    @JsonProperty("SEP_PARTCP_PARTL_VSTD_CNT")  
    private Integer Sep_Partcp_Partl_Vstd_Cnt;
    @JsonProperty("CONTRIB_EMPLRS_CNT")  
    private Integer Contrib_Emplrs_Cnt;
    @JsonProperty("TYPE_PENSION_BNFT_CODE")  
    private String Type_Pension_Bnft_Code;
    @JsonProperty("TYPE_WELFARE_BNFT_CODE")  
    private String Type_Welfare_Bnft_Code;
    @JsonProperty("FUNDING_INSURANCE_IND")  
    private String Funding_Insurance_Ind;
    @JsonProperty("FUNDING_SEC412_IND")  
    private String Funding_Sec412_Ind;
    @JsonProperty("FUNDING_TRUST_IND")  
    private String Funding_Trust_Ind;
    @JsonProperty("FUNDING_GEN_ASSET_IND")  
    private String Funding_Gen_Asset_Ind;
    @JsonProperty("BENEFIT_INSURANCE_IND")  
    private String Benefit_Insurance_Ind;
    @JsonProperty("BENEFIT_SEC412_IND")  
    private String Benefit_Sec412_Ind;
    @JsonProperty("BENEFIT_TRUST_IND")  
    private String Benefit_Trust_Ind;
    @JsonProperty("BENEFIT_GEN_ASSET_IND")  
    private String Benefit_Gen_Asset_Ind;
    @JsonProperty("SCH_R_ATTACHED_IND")  
    private String Sch_R_Attached_Ind;
    @JsonProperty("SCH_MB_ATTACHED_IND")  
    private String Sch_Mb_Attached_Ind;
    @JsonProperty("SCH_SB_ATTACHED_IND")  
    private String Sch_Sb_Attached_Ind;
    @JsonProperty("SCH_H_ATTACHED_IND")  
    private String Sch_H_Attached_Ind;
    @JsonProperty("SCH_I_ATTACHED_IND")  
    private String Sch_I_Attached_Ind;
    @JsonProperty("SCH_A_ATTACHED_IND")  
    private String Sch_A_Attached_Ind;
    @JsonProperty("NUM_SCH_A_ATTACHED_CNT")  
    private String Num_Sch_A_Attached_Cnt;
    @JsonProperty("SCH_C_ATTACHED_IND")  
    private String Sch_C_Attached_Ind;
    @JsonProperty("SCH_D_ATTACHED_IND")  
    private String Sch_D_Attached_Ind;
    @JsonProperty("SCH_G_ATTACHED_IND")  
    private String Sch_G_Attached_Ind;
    @JsonProperty("FILING_STATUS")  
    private String Filing_Status;
    @JsonProperty("DATE_RECEIVED")  
    private String Date_Received;
    @JsonProperty("VALID_ADMIN_SIGNATURE")  
    private String Valid_Admin_Signature;
    @JsonProperty("VALID_DFE_SIGNATURE")  
    private String Valid_Dfe_Signature;
    @JsonProperty("VALID_SPONSOR_SIGNATURE")  
    private String Valid_Sponsor_Signature;
    @JsonProperty("ADMIN_PHONE_NUM_FOREIGN")  
    private String Admin_Phone_Num_Foreign;
    
    
    @JsonProperty("SPONS_DFE_PHONE_NUM_FOREIGN")  
    private String Spons_Dfe_Phone_Num_Foreign;
    @JsonProperty("ADMIN_NAME_SAME_SPON_IND")  
    private String Admin_Name_Same_Spon_Ind;
    @JsonProperty("ADMIN_ADDRESS_SAME_SPON_IND")  
    private String Admin_Address_Same_Spon_Ind;
    @JsonProperty("PREPARER_NAME")  
    private String Preparer_Name;
    @JsonProperty("PREPARER_FIRM_NAME")  
    private String Preparer_Firm_Name;
    @JsonProperty("PREPARER_US_ADDRESS1")  
    private String Preparer_Us_Address1;
    @JsonProperty("PREPARER_US_ADDRESS2")  
    private String Preparer_Us_Address2;
    @JsonProperty("PREPARER_US_CITY")  
    private String Preparer_Us_City;
    @JsonProperty("PREPARER_US_STATE")  
    private String Preparer_Us_State;
    @JsonProperty("PREPARER_US_ZIP")  
    private String Preparer_Us_Zip;
    @JsonProperty("PREPARER_FOREIGN_ADDRESS1")  
    private String Preparer_Foreign_Address1;
    @JsonProperty("PREPARER_FOREIGN_ADDRESS2")  
    private String Preparer_Foreign_Address2;
    @JsonProperty("PREPARER_FOREIGN_CITY")  
    private String Preparer_Foreign_City;
    @JsonProperty("PREPARER_FOREIGN_PROV_STATE")  
    private String Preparer_Foreign_Prov_State;
    @JsonProperty("PREPARER_FOREIGN_CNTRY")  
    private String Preparer_Foreign_Cntry;
    @JsonProperty("PREPARER_FOREIGN_POSTAL_CD")  
    private String Preparer_Foreign_Postal_Cd;
    @JsonProperty("PREPARER_PHONE_NUM")  
    private String Preparer_Phone_Num;
    @JsonProperty("PREPARER_PHONE_NUM_FOREIGN")  
    private String Preparer_Phone_Num_Foreign;
    @JsonProperty("TOT_ACT_PARTCP_BOY_CNT")  
    private Integer Tot_Act_Partcp_Boy_Cnt;
    @JsonProperty("SUBJ_M1_FILING_REQ_IND")  
    private String Subj_M1_Filing_Req_Ind;
    @JsonProperty("COMPLIANCE_M1_FILING_REQ_IND")  
    private String Compliance_M1_Filing_Req_Ind;
    @JsonProperty("M1_RECEIPT_CONFIRMATION_CODE")  
    private String M1_Receipt_Confirmation_Code;
    @JsonProperty("ADMIN_MANUAL_SIGNED_DATE")  
    private String Admin_Manual_Signed_Date;
    @JsonProperty("ADMIN_MANUAL_SIGNED_NAME")  
    private String Admin_Manual_Signed_Name;
    @JsonProperty("LAST_RPT_PLAN_NAME")  
    private String Last_Rpt_Plan_Name;
    @Field(type=String ,index=FieldIndex.analyzed)    
    @JsonProperty("PLAN_NAME")
    private String planName;    
    @JsonProperty("SPONS_MANUAL_SIGNED_DATE")  
    private String Spons_Manual_Signed_Date;
    @JsonProperty("SPONS_MANUAL_SIGNED_NAME")  
    private String Spons_Manual_Signed_Name;
    @JsonProperty("DFE_MANUAL_SIGNED_DATE")  
    private String Dfe_Manual_Signed_Date;
    @JsonProperty("DFE_MANUAL_SIGNED_NAME")  
    private String Dfe_Manual_Signed_Name;
    
    
    public Plan() {
    }


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getAckId() {
		return ackId;
	}


	public void setAckId(String ackId) {
		this.ackId = ackId;
	}


	public String getForm_Plan_Year_Begin_Date() {
		return Form_Plan_Year_Begin_Date;
	}


	public void setForm_Plan_Year_Begin_Date(String form_Plan_Year_Begin_Date) {
		Form_Plan_Year_Begin_Date = form_Plan_Year_Begin_Date;
	}


	public String getForm_Tax_Prd() {
		return Form_Tax_Prd;
	}


	public void setForm_Tax_Prd(String form_Tax_Prd) {
		Form_Tax_Prd = form_Tax_Prd;
	}


	public String getType_Plan_Entity_Cd() {
		return Type_Plan_Entity_Cd;
	}


	public void setType_Plan_Entity_Cd(String type_Plan_Entity_Cd) {
		Type_Plan_Entity_Cd = type_Plan_Entity_Cd;
	}


	public String getType_Dfe_Plan_Entity_Cd() {
		return Type_Dfe_Plan_Entity_Cd;
	}


	public void setType_Dfe_Plan_Entity_Cd(String type_Dfe_Plan_Entity_Cd) {
		Type_Dfe_Plan_Entity_Cd = type_Dfe_Plan_Entity_Cd;
	}


	public String getInitial_Filing_Ind() {
		return Initial_Filing_Ind;
	}


	public void setInitial_Filing_Ind(String initial_Filing_Ind) {
		Initial_Filing_Ind = initial_Filing_Ind;
	}


	public String getAmended_Ind() {
		return Amended_Ind;
	}


	public void setAmended_Ind(String amended_Ind) {
		Amended_Ind = amended_Ind;
	}


	public String getFinal_Filing_Ind() {
		return Final_Filing_Ind;
	}


	public void setFinal_Filing_Ind(String final_Filing_Ind) {
		Final_Filing_Ind = final_Filing_Ind;
	}


	public String getShort_Plan_Yr_Ind() {
		return Short_Plan_Yr_Ind;
	}


	public void setShort_Plan_Yr_Ind(String short_Plan_Yr_Ind) {
		Short_Plan_Yr_Ind = short_Plan_Yr_Ind;
	}


	public String getCollective_Bargain_Ind() {
		return Collective_Bargain_Ind;
	}


	public void setCollective_Bargain_Ind(String collective_Bargain_Ind) {
		Collective_Bargain_Ind = collective_Bargain_Ind;
	}


	public String getF5558_Application_Filed_Ind() {
		return F5558_Application_Filed_Ind;
	}


	public void setF5558_Application_Filed_Ind(String f5558_Application_Filed_Ind) {
		F5558_Application_Filed_Ind = f5558_Application_Filed_Ind;
	}


	public String getExt_Automatic_Ind() {
		return Ext_Automatic_Ind;
	}


	public void setExt_Automatic_Ind(String ext_Automatic_Ind) {
		Ext_Automatic_Ind = ext_Automatic_Ind;
	}


	public String getDfvc_Program_Ind() {
		return Dfvc_Program_Ind;
	}


	public void setDfvc_Program_Ind(String dfvc_Program_Ind) {
		Dfvc_Program_Ind = dfvc_Program_Ind;
	}


	public String getExt_Special_Ind() {
		return Ext_Special_Ind;
	}


	public void setExt_Special_Ind(String ext_Special_Ind) {
		Ext_Special_Ind = ext_Special_Ind;
	}


	public String getExt_Special_Text() {
		return Ext_Special_Text;
	}


	public void setExt_Special_Text(String ext_Special_Text) {
		Ext_Special_Text = ext_Special_Text;
	}


	public String getSpons_Dfe_Pn() {
		return Spons_Dfe_Pn;
	}


	public void setSpons_Dfe_Pn(String spons_Dfe_Pn) {
		Spons_Dfe_Pn = spons_Dfe_Pn;
	}


	public String getPlan_Eff_Date() {
		return Plan_Eff_Date;
	}


	public void setPlan_Eff_Date(String plan_Eff_Date) {
		Plan_Eff_Date = plan_Eff_Date;
	}


	public String getSponsorDfeName() {
		return sponsorDfeName;
	}


	public void setSponsorDfeName(String sponsorDfeName) {
		this.sponsorDfeName = sponsorDfeName;
	}


	public String getSpons_Dfe_Dba_Name() {
		return Spons_Dfe_Dba_Name;
	}


	public void setSpons_Dfe_Dba_Name(String spons_Dfe_Dba_Name) {
		Spons_Dfe_Dba_Name = spons_Dfe_Dba_Name;
	}


	public String getSpons_Dfe_Care_Of_Name() {
		return Spons_Dfe_Care_Of_Name;
	}


	public void setSpons_Dfe_Care_Of_Name(String spons_Dfe_Care_Of_Name) {
		Spons_Dfe_Care_Of_Name = spons_Dfe_Care_Of_Name;
	}


	public String getSpons_Dfe_Mail_Us_Address1() {
		return Spons_Dfe_Mail_Us_Address1;
	}


	public void setSpons_Dfe_Mail_Us_Address1(String spons_Dfe_Mail_Us_Address1) {
		Spons_Dfe_Mail_Us_Address1 = spons_Dfe_Mail_Us_Address1;
	}


	public String getSpons_Dfe_Mail_Us_Address2() {
		return Spons_Dfe_Mail_Us_Address2;
	}


	public void setSpons_Dfe_Mail_Us_Address2(String spons_Dfe_Mail_Us_Address2) {
		Spons_Dfe_Mail_Us_Address2 = spons_Dfe_Mail_Us_Address2;
	}


	public String getSpons_Dfe_Mail_Us_City() {
		return Spons_Dfe_Mail_Us_City;
	}


	public void setSpons_Dfe_Mail_Us_City(String spons_Dfe_Mail_Us_City) {
		Spons_Dfe_Mail_Us_City = spons_Dfe_Mail_Us_City;
	}


	public String getSpons_Dfe_Mail_Us_State() {
		return Spons_Dfe_Mail_Us_State;
	}


	public void setSpons_Dfe_Mail_Us_State(String spons_Dfe_Mail_Us_State) {
		Spons_Dfe_Mail_Us_State = spons_Dfe_Mail_Us_State;
	}


	public String getSpons_Dfe_Mail_Us_Zip() {
		return Spons_Dfe_Mail_Us_Zip;
	}


	public void setSpons_Dfe_Mail_Us_Zip(String spons_Dfe_Mail_Us_Zip) {
		Spons_Dfe_Mail_Us_Zip = spons_Dfe_Mail_Us_Zip;
	}


	public String getSpons_Dfe_Mail_Foreign_Addr1() {
		return Spons_Dfe_Mail_Foreign_Addr1;
	}


	public void setSpons_Dfe_Mail_Foreign_Addr1(String spons_Dfe_Mail_Foreign_Addr1) {
		Spons_Dfe_Mail_Foreign_Addr1 = spons_Dfe_Mail_Foreign_Addr1;
	}


	public String getSpons_Dfe_Mail_Foreign_Addr2() {
		return Spons_Dfe_Mail_Foreign_Addr2;
	}


	public void setSpons_Dfe_Mail_Foreign_Addr2(String spons_Dfe_Mail_Foreign_Addr2) {
		Spons_Dfe_Mail_Foreign_Addr2 = spons_Dfe_Mail_Foreign_Addr2;
	}


	public String getSpons_Dfe_Mail_Foreign_City() {
		return Spons_Dfe_Mail_Foreign_City;
	}


	public void setSpons_Dfe_Mail_Foreign_City(String spons_Dfe_Mail_Foreign_City) {
		Spons_Dfe_Mail_Foreign_City = spons_Dfe_Mail_Foreign_City;
	}


	public String getSpons_Dfe_Mail_Forgn_Prov_St() {
		return Spons_Dfe_Mail_Forgn_Prov_St;
	}


	public void setSpons_Dfe_Mail_Forgn_Prov_St(String spons_Dfe_Mail_Forgn_Prov_St) {
		Spons_Dfe_Mail_Forgn_Prov_St = spons_Dfe_Mail_Forgn_Prov_St;
	}


	public String getSpons_Dfe_Mail_Foreign_Cntry() {
		return Spons_Dfe_Mail_Foreign_Cntry;
	}


	public void setSpons_Dfe_Mail_Foreign_Cntry(String spons_Dfe_Mail_Foreign_Cntry) {
		Spons_Dfe_Mail_Foreign_Cntry = spons_Dfe_Mail_Foreign_Cntry;
	}


	public String getSpons_Dfe_Mail_Forgn_Postal_Cd() {
		return Spons_Dfe_Mail_Forgn_Postal_Cd;
	}


	public void setSpons_Dfe_Mail_Forgn_Postal_Cd(String spons_Dfe_Mail_Forgn_Postal_Cd) {
		Spons_Dfe_Mail_Forgn_Postal_Cd = spons_Dfe_Mail_Forgn_Postal_Cd;
	}


	public String getSpons_Dfe_Loc_Us_Address1() {
		return Spons_Dfe_Loc_Us_Address1;
	}


	public void setSpons_Dfe_Loc_Us_Address1(String spons_Dfe_Loc_Us_Address1) {
		Spons_Dfe_Loc_Us_Address1 = spons_Dfe_Loc_Us_Address1;
	}


	public String getSpons_Dfe_Loc_Us_Address2() {
		return Spons_Dfe_Loc_Us_Address2;
	}


	public void setSpons_Dfe_Loc_Us_Address2(String spons_Dfe_Loc_Us_Address2) {
		Spons_Dfe_Loc_Us_Address2 = spons_Dfe_Loc_Us_Address2;
	}


	public String getSpons_Dfe_Loc_Us_City() {
		return Spons_Dfe_Loc_Us_City;
	}


	public void setSpons_Dfe_Loc_Us_City(String spons_Dfe_Loc_Us_City) {
		Spons_Dfe_Loc_Us_City = spons_Dfe_Loc_Us_City;
	}


	public String getSpons_Dfe_Loc_Us_State() {
		return Spons_Dfe_Loc_Us_State;
	}


	public void setSpons_Dfe_Loc_Us_State(String spons_Dfe_Loc_Us_State) {
		Spons_Dfe_Loc_Us_State = spons_Dfe_Loc_Us_State;
	}


	public String getSpons_Dfe_Loc_Us_Zip() {
		return Spons_Dfe_Loc_Us_Zip;
	}


	public void setSpons_Dfe_Loc_Us_Zip(String spons_Dfe_Loc_Us_Zip) {
		Spons_Dfe_Loc_Us_Zip = spons_Dfe_Loc_Us_Zip;
	}


	public String getSpons_Dfe_Loc_Foreign_Address1() {
		return Spons_Dfe_Loc_Foreign_Address1;
	}


	public void setSpons_Dfe_Loc_Foreign_Address1(String spons_Dfe_Loc_Foreign_Address1) {
		Spons_Dfe_Loc_Foreign_Address1 = spons_Dfe_Loc_Foreign_Address1;
	}


	public String getSpons_Dfe_Loc_Foreign_Address2() {
		return Spons_Dfe_Loc_Foreign_Address2;
	}


	public void setSpons_Dfe_Loc_Foreign_Address2(String spons_Dfe_Loc_Foreign_Address2) {
		Spons_Dfe_Loc_Foreign_Address2 = spons_Dfe_Loc_Foreign_Address2;
	}


	public String getSpons_Dfe_Loc_Foreign_City() {
		return Spons_Dfe_Loc_Foreign_City;
	}


	public void setSpons_Dfe_Loc_Foreign_City(String spons_Dfe_Loc_Foreign_City) {
		Spons_Dfe_Loc_Foreign_City = spons_Dfe_Loc_Foreign_City;
	}


	public String getSpons_Dfe_Loc_Forgn_Prov_St() {
		return Spons_Dfe_Loc_Forgn_Prov_St;
	}


	public void setSpons_Dfe_Loc_Forgn_Prov_St(String spons_Dfe_Loc_Forgn_Prov_St) {
		Spons_Dfe_Loc_Forgn_Prov_St = spons_Dfe_Loc_Forgn_Prov_St;
	}


	public String getSpons_Dfe_Loc_Foreign_Cntry() {
		return Spons_Dfe_Loc_Foreign_Cntry;
	}


	public void setSpons_Dfe_Loc_Foreign_Cntry(String spons_Dfe_Loc_Foreign_Cntry) {
		Spons_Dfe_Loc_Foreign_Cntry = spons_Dfe_Loc_Foreign_Cntry;
	}


	public String getSpons_Dfe_Loc_Forgn_Postal_Cd() {
		return Spons_Dfe_Loc_Forgn_Postal_Cd;
	}


	public void setSpons_Dfe_Loc_Forgn_Postal_Cd(String spons_Dfe_Loc_Forgn_Postal_Cd) {
		Spons_Dfe_Loc_Forgn_Postal_Cd = spons_Dfe_Loc_Forgn_Postal_Cd;
	}


	public String getSpons_Dfe_Ein() {
		return Spons_Dfe_Ein;
	}


	public void setSpons_Dfe_Ein(String spons_Dfe_Ein) {
		Spons_Dfe_Ein = spons_Dfe_Ein;
	}


	public String getSpons_Dfe_Phone_Num() {
		return Spons_Dfe_Phone_Num;
	}


	public void setSpons_Dfe_Phone_Num(String spons_Dfe_Phone_Num) {
		Spons_Dfe_Phone_Num = spons_Dfe_Phone_Num;
	}


	public String getBusiness_Code() {
		return Business_Code;
	}


	public void setBusiness_Code(String business_Code) {
		Business_Code = business_Code;
	}


	public String getAdmin_Name() {
		return Admin_Name;
	}


	public void setAdmin_Name(String admin_Name) {
		Admin_Name = admin_Name;
	}


	public String getAdmin_Care_Of_Name() {
		return Admin_Care_Of_Name;
	}


	public void setAdmin_Care_Of_Name(String admin_Care_Of_Name) {
		Admin_Care_Of_Name = admin_Care_Of_Name;
	}


	public String getAdmin_Us_Address1() {
		return Admin_Us_Address1;
	}


	public void setAdmin_Us_Address1(String admin_Us_Address1) {
		Admin_Us_Address1 = admin_Us_Address1;
	}


	public String getAdmin_Us_Address2() {
		return Admin_Us_Address2;
	}


	public void setAdmin_Us_Address2(String admin_Us_Address2) {
		Admin_Us_Address2 = admin_Us_Address2;
	}


	public String getAdmin_Us_City() {
		return Admin_Us_City;
	}


	public void setAdmin_Us_City(String admin_Us_City) {
		Admin_Us_City = admin_Us_City;
	}


	public String getAdmin_Us_State() {
		return Admin_Us_State;
	}


	public void setAdmin_Us_State(String admin_Us_State) {
		Admin_Us_State = admin_Us_State;
	}


	public String getAdmin_Us_Zip() {
		return Admin_Us_Zip;
	}


	public void setAdmin_Us_Zip(String admin_Us_Zip) {
		Admin_Us_Zip = admin_Us_Zip;
	}


	public String getAdmin_Foreign_Address1() {
		return Admin_Foreign_Address1;
	}


	public void setAdmin_Foreign_Address1(String admin_Foreign_Address1) {
		Admin_Foreign_Address1 = admin_Foreign_Address1;
	}


	public String getAdmin_Foreign_Address2() {
		return Admin_Foreign_Address2;
	}


	public void setAdmin_Foreign_Address2(String admin_Foreign_Address2) {
		Admin_Foreign_Address2 = admin_Foreign_Address2;
	}


	public String getAdmin_Foreign_City() {
		return Admin_Foreign_City;
	}


	public void setAdmin_Foreign_City(String admin_Foreign_City) {
		Admin_Foreign_City = admin_Foreign_City;
	}


	public String getAdmin_Foreign_Prov_State() {
		return Admin_Foreign_Prov_State;
	}


	public void setAdmin_Foreign_Prov_State(String admin_Foreign_Prov_State) {
		Admin_Foreign_Prov_State = admin_Foreign_Prov_State;
	}


	public String getAdmin_Foreign_Cntry() {
		return Admin_Foreign_Cntry;
	}


	public void setAdmin_Foreign_Cntry(String admin_Foreign_Cntry) {
		Admin_Foreign_Cntry = admin_Foreign_Cntry;
	}


	public String getAdmin_Foreign_Postal_Cd() {
		return Admin_Foreign_Postal_Cd;
	}


	public void setAdmin_Foreign_Postal_Cd(String admin_Foreign_Postal_Cd) {
		Admin_Foreign_Postal_Cd = admin_Foreign_Postal_Cd;
	}


	public String getAdmin_Ein() {
		return Admin_Ein;
	}


	public void setAdmin_Ein(String admin_Ein) {
		Admin_Ein = admin_Ein;
	}


	public String getAdmin_Phone_Num() {
		return Admin_Phone_Num;
	}


	public void setAdmin_Phone_Num(String admin_Phone_Num) {
		Admin_Phone_Num = admin_Phone_Num;
	}


	public String getLast_Rpt_Spons_Name() {
		return Last_Rpt_Spons_Name;
	}


	public void setLast_Rpt_Spons_Name(String last_Rpt_Spons_Name) {
		Last_Rpt_Spons_Name = last_Rpt_Spons_Name;
	}


	public String getLast_Rpt_Spons_Ein() {
		return Last_Rpt_Spons_Ein;
	}


	public void setLast_Rpt_Spons_Ein(String last_Rpt_Spons_Ein) {
		Last_Rpt_Spons_Ein = last_Rpt_Spons_Ein;
	}


	public String getLast_Rpt_Plan_Num() {
		return Last_Rpt_Plan_Num;
	}


	public void setLast_Rpt_Plan_Num(String last_Rpt_Plan_Num) {
		Last_Rpt_Plan_Num = last_Rpt_Plan_Num;
	}


	public String getAdmin_Signed_Date() {
		return Admin_Signed_Date;
	}


	public void setAdmin_Signed_Date(String admin_Signed_Date) {
		Admin_Signed_Date = admin_Signed_Date;
	}


	public String getAdmin_Signed_Name() {
		return Admin_Signed_Name;
	}


	public void setAdmin_Signed_Name(String admin_Signed_Name) {
		Admin_Signed_Name = admin_Signed_Name;
	}


	public String getSpons_Signed_Date() {
		return Spons_Signed_Date;
	}


	public void setSpons_Signed_Date(String spons_Signed_Date) {
		Spons_Signed_Date = spons_Signed_Date;
	}


	public String getSpons_Signed_Name() {
		return Spons_Signed_Name;
	}


	public void setSpons_Signed_Name(String spons_Signed_Name) {
		Spons_Signed_Name = spons_Signed_Name;
	}


	public String getDfe_Signed_Date() {
		return Dfe_Signed_Date;
	}


	public void setDfe_Signed_Date(String dfe_Signed_Date) {
		Dfe_Signed_Date = dfe_Signed_Date;
	}


	public String getDfe_Signed_Name() {
		return Dfe_Signed_Name;
	}


	public void setDfe_Signed_Name(String dfe_Signed_Name) {
		Dfe_Signed_Name = dfe_Signed_Name;
	}


	public Integer getTot_Partcp_Boy_Cnt() {
		return Tot_Partcp_Boy_Cnt;
	}


	public void setTot_Partcp_Boy_Cnt(Integer tot_Partcp_Boy_Cnt) {
		Tot_Partcp_Boy_Cnt = tot_Partcp_Boy_Cnt;
	}


	public Integer getTot_Active_Partcp_Cnt() {
		return Tot_Active_Partcp_Cnt;
	}


	public void setTot_Active_Partcp_Cnt(Integer tot_Active_Partcp_Cnt) {
		Tot_Active_Partcp_Cnt = tot_Active_Partcp_Cnt;
	}


	public Integer getRtd_Sep_Partcp_Rcvg_Cnt() {
		return Rtd_Sep_Partcp_Rcvg_Cnt;
	}


	public void setRtd_Sep_Partcp_Rcvg_Cnt(Integer rtd_Sep_Partcp_Rcvg_Cnt) {
		Rtd_Sep_Partcp_Rcvg_Cnt = rtd_Sep_Partcp_Rcvg_Cnt;
	}


	public Integer getRtd_Sep_Partcp_Fut_Cnt() {
		return Rtd_Sep_Partcp_Fut_Cnt;
	}


	public void setRtd_Sep_Partcp_Fut_Cnt(Integer rtd_Sep_Partcp_Fut_Cnt) {
		Rtd_Sep_Partcp_Fut_Cnt = rtd_Sep_Partcp_Fut_Cnt;
	}


	public Integer getSubtl_Act_Rtd_Sep_Cnt() {
		return Subtl_Act_Rtd_Sep_Cnt;
	}


	public void setSubtl_Act_Rtd_Sep_Cnt(Integer subtl_Act_Rtd_Sep_Cnt) {
		Subtl_Act_Rtd_Sep_Cnt = subtl_Act_Rtd_Sep_Cnt;
	}


	public Integer getBenef_Rcvg_Bnft_Cnt() {
		return Benef_Rcvg_Bnft_Cnt;
	}


	public void setBenef_Rcvg_Bnft_Cnt(Integer benef_Rcvg_Bnft_Cnt) {
		Benef_Rcvg_Bnft_Cnt = benef_Rcvg_Bnft_Cnt;
	}


	public Integer getTot_Act_Rtd_Sep_Benef_Cnt() {
		return Tot_Act_Rtd_Sep_Benef_Cnt;
	}


	public void setTot_Act_Rtd_Sep_Benef_Cnt(Integer tot_Act_Rtd_Sep_Benef_Cnt) {
		Tot_Act_Rtd_Sep_Benef_Cnt = tot_Act_Rtd_Sep_Benef_Cnt;
	}


	public Integer getPartcp_Account_Bal_Cnt() {
		return Partcp_Account_Bal_Cnt;
	}


	public void setPartcp_Account_Bal_Cnt(Integer partcp_Account_Bal_Cnt) {
		Partcp_Account_Bal_Cnt = partcp_Account_Bal_Cnt;
	}


	public Integer getSep_Partcp_Partl_Vstd_Cnt() {
		return Sep_Partcp_Partl_Vstd_Cnt;
	}


	public void setSep_Partcp_Partl_Vstd_Cnt(Integer sep_Partcp_Partl_Vstd_Cnt) {
		Sep_Partcp_Partl_Vstd_Cnt = sep_Partcp_Partl_Vstd_Cnt;
	}


	public Integer getContrib_Emplrs_Cnt() {
		return Contrib_Emplrs_Cnt;
	}


	public void setContrib_Emplrs_Cnt(Integer contrib_Emplrs_Cnt) {
		Contrib_Emplrs_Cnt = contrib_Emplrs_Cnt;
	}


	public String getType_Pension_Bnft_Code() {
		return Type_Pension_Bnft_Code;
	}


	public void setType_Pension_Bnft_Code(String type_Pension_Bnft_Code) {
		Type_Pension_Bnft_Code = type_Pension_Bnft_Code;
	}


	public String getType_Welfare_Bnft_Code() {
		return Type_Welfare_Bnft_Code;
	}


	public void setType_Welfare_Bnft_Code(String type_Welfare_Bnft_Code) {
		Type_Welfare_Bnft_Code = type_Welfare_Bnft_Code;
	}


	public String getFunding_Insurance_Ind() {
		return Funding_Insurance_Ind;
	}


	public void setFunding_Insurance_Ind(String funding_Insurance_Ind) {
		Funding_Insurance_Ind = funding_Insurance_Ind;
	}


	public String getFunding_Sec412_Ind() {
		return Funding_Sec412_Ind;
	}


	public void setFunding_Sec412_Ind(String funding_Sec412_Ind) {
		Funding_Sec412_Ind = funding_Sec412_Ind;
	}


	public String getFunding_Trust_Ind() {
		return Funding_Trust_Ind;
	}


	public void setFunding_Trust_Ind(String funding_Trust_Ind) {
		Funding_Trust_Ind = funding_Trust_Ind;
	}


	public String getFunding_Gen_Asset_Ind() {
		return Funding_Gen_Asset_Ind;
	}


	public void setFunding_Gen_Asset_Ind(String funding_Gen_Asset_Ind) {
		Funding_Gen_Asset_Ind = funding_Gen_Asset_Ind;
	}


	public String getBenefit_Insurance_Ind() {
		return Benefit_Insurance_Ind;
	}


	public void setBenefit_Insurance_Ind(String benefit_Insurance_Ind) {
		Benefit_Insurance_Ind = benefit_Insurance_Ind;
	}


	public String getBenefit_Sec412_Ind() {
		return Benefit_Sec412_Ind;
	}


	public void setBenefit_Sec412_Ind(String benefit_Sec412_Ind) {
		Benefit_Sec412_Ind = benefit_Sec412_Ind;
	}


	public String getBenefit_Trust_Ind() {
		return Benefit_Trust_Ind;
	}


	public void setBenefit_Trust_Ind(String benefit_Trust_Ind) {
		Benefit_Trust_Ind = benefit_Trust_Ind;
	}


	public String getBenefit_Gen_Asset_Ind() {
		return Benefit_Gen_Asset_Ind;
	}


	public void setBenefit_Gen_Asset_Ind(String benefit_Gen_Asset_Ind) {
		Benefit_Gen_Asset_Ind = benefit_Gen_Asset_Ind;
	}


	public String getSch_R_Attached_Ind() {
		return Sch_R_Attached_Ind;
	}


	public void setSch_R_Attached_Ind(String sch_R_Attached_Ind) {
		Sch_R_Attached_Ind = sch_R_Attached_Ind;
	}


	public String getSch_Mb_Attached_Ind() {
		return Sch_Mb_Attached_Ind;
	}


	public void setSch_Mb_Attached_Ind(String sch_Mb_Attached_Ind) {
		Sch_Mb_Attached_Ind = sch_Mb_Attached_Ind;
	}


	public String getSch_Sb_Attached_Ind() {
		return Sch_Sb_Attached_Ind;
	}


	public void setSch_Sb_Attached_Ind(String sch_Sb_Attached_Ind) {
		Sch_Sb_Attached_Ind = sch_Sb_Attached_Ind;
	}


	public String getSch_H_Attached_Ind() {
		return Sch_H_Attached_Ind;
	}


	public void setSch_H_Attached_Ind(String sch_H_Attached_Ind) {
		Sch_H_Attached_Ind = sch_H_Attached_Ind;
	}


	public String getSch_I_Attached_Ind() {
		return Sch_I_Attached_Ind;
	}


	public void setSch_I_Attached_Ind(String sch_I_Attached_Ind) {
		Sch_I_Attached_Ind = sch_I_Attached_Ind;
	}


	public String getSch_A_Attached_Ind() {
		return Sch_A_Attached_Ind;
	}


	public void setSch_A_Attached_Ind(String sch_A_Attached_Ind) {
		Sch_A_Attached_Ind = sch_A_Attached_Ind;
	}


	public String getNum_Sch_A_Attached_Cnt() {
		return Num_Sch_A_Attached_Cnt;
	}


	public void setNum_Sch_A_Attached_Cnt(String num_Sch_A_Attached_Cnt) {
		Num_Sch_A_Attached_Cnt = num_Sch_A_Attached_Cnt;
	}


	public String getSch_C_Attached_Ind() {
		return Sch_C_Attached_Ind;
	}


	public void setSch_C_Attached_Ind(String sch_C_Attached_Ind) {
		Sch_C_Attached_Ind = sch_C_Attached_Ind;
	}


	public String getSch_D_Attached_Ind() {
		return Sch_D_Attached_Ind;
	}


	public void setSch_D_Attached_Ind(String sch_D_Attached_Ind) {
		Sch_D_Attached_Ind = sch_D_Attached_Ind;
	}


	public String getSch_G_Attached_Ind() {
		return Sch_G_Attached_Ind;
	}


	public void setSch_G_Attached_Ind(String sch_G_Attached_Ind) {
		Sch_G_Attached_Ind = sch_G_Attached_Ind;
	}


	public String getFiling_Status() {
		return Filing_Status;
	}


	public void setFiling_Status(String filing_Status) {
		Filing_Status = filing_Status;
	}


	public String getDate_Received() {
		return Date_Received;
	}


	public void setDate_Received(String date_Received) {
		Date_Received = date_Received;
	}


	public String getValid_Admin_Signature() {
		return Valid_Admin_Signature;
	}


	public void setValid_Admin_Signature(String valid_Admin_Signature) {
		Valid_Admin_Signature = valid_Admin_Signature;
	}


	public String getValid_Dfe_Signature() {
		return Valid_Dfe_Signature;
	}


	public void setValid_Dfe_Signature(String valid_Dfe_Signature) {
		Valid_Dfe_Signature = valid_Dfe_Signature;
	}


	public String getValid_Sponsor_Signature() {
		return Valid_Sponsor_Signature;
	}


	public void setValid_Sponsor_Signature(String valid_Sponsor_Signature) {
		Valid_Sponsor_Signature = valid_Sponsor_Signature;
	}


	public String getAdmin_Phone_Num_Foreign() {
		return Admin_Phone_Num_Foreign;
	}


	public void setAdmin_Phone_Num_Foreign(String admin_Phone_Num_Foreign) {
		Admin_Phone_Num_Foreign = admin_Phone_Num_Foreign;
	}


	public String getSpons_Dfe_Phone_Num_Foreign() {
		return Spons_Dfe_Phone_Num_Foreign;
	}


	public void setSpons_Dfe_Phone_Num_Foreign(String spons_Dfe_Phone_Num_Foreign) {
		Spons_Dfe_Phone_Num_Foreign = spons_Dfe_Phone_Num_Foreign;
	}


	public String getAdmin_Name_Same_Spon_Ind() {
		return Admin_Name_Same_Spon_Ind;
	}


	public void setAdmin_Name_Same_Spon_Ind(String admin_Name_Same_Spon_Ind) {
		Admin_Name_Same_Spon_Ind = admin_Name_Same_Spon_Ind;
	}


	public String getAdmin_Address_Same_Spon_Ind() {
		return Admin_Address_Same_Spon_Ind;
	}


	public void setAdmin_Address_Same_Spon_Ind(String admin_Address_Same_Spon_Ind) {
		Admin_Address_Same_Spon_Ind = admin_Address_Same_Spon_Ind;
	}


	public String getPreparer_Name() {
		return Preparer_Name;
	}


	public void setPreparer_Name(String preparer_Name) {
		Preparer_Name = preparer_Name;
	}


	public String getPreparer_Firm_Name() {
		return Preparer_Firm_Name;
	}


	public void setPreparer_Firm_Name(String preparer_Firm_Name) {
		Preparer_Firm_Name = preparer_Firm_Name;
	}


	public String getPreparer_Us_Address1() {
		return Preparer_Us_Address1;
	}


	public void setPreparer_Us_Address1(String preparer_Us_Address1) {
		Preparer_Us_Address1 = preparer_Us_Address1;
	}


	public String getPreparer_Us_Address2() {
		return Preparer_Us_Address2;
	}


	public void setPreparer_Us_Address2(String preparer_Us_Address2) {
		Preparer_Us_Address2 = preparer_Us_Address2;
	}


	public String getPreparer_Us_City() {
		return Preparer_Us_City;
	}


	public void setPreparer_Us_City(String preparer_Us_City) {
		Preparer_Us_City = preparer_Us_City;
	}


	public String getPreparer_Us_State() {
		return Preparer_Us_State;
	}


	public void setPreparer_Us_State(String preparer_Us_State) {
		Preparer_Us_State = preparer_Us_State;
	}


	public String getPreparer_Us_Zip() {
		return Preparer_Us_Zip;
	}


	public void setPreparer_Us_Zip(String preparer_Us_Zip) {
		Preparer_Us_Zip = preparer_Us_Zip;
	}


	public String getPreparer_Foreign_Address1() {
		return Preparer_Foreign_Address1;
	}


	public void setPreparer_Foreign_Address1(String preparer_Foreign_Address1) {
		Preparer_Foreign_Address1 = preparer_Foreign_Address1;
	}


	public String getPreparer_Foreign_Address2() {
		return Preparer_Foreign_Address2;
	}


	public void setPreparer_Foreign_Address2(String preparer_Foreign_Address2) {
		Preparer_Foreign_Address2 = preparer_Foreign_Address2;
	}


	public String getPreparer_Foreign_City() {
		return Preparer_Foreign_City;
	}


	public void setPreparer_Foreign_City(String preparer_Foreign_City) {
		Preparer_Foreign_City = preparer_Foreign_City;
	}


	public String getPreparer_Foreign_Prov_State() {
		return Preparer_Foreign_Prov_State;
	}


	public void setPreparer_Foreign_Prov_State(String preparer_Foreign_Prov_State) {
		Preparer_Foreign_Prov_State = preparer_Foreign_Prov_State;
	}


	public String getPreparer_Foreign_Cntry() {
		return Preparer_Foreign_Cntry;
	}


	public void setPreparer_Foreign_Cntry(String preparer_Foreign_Cntry) {
		Preparer_Foreign_Cntry = preparer_Foreign_Cntry;
	}


	public String getPreparer_Foreign_Postal_Cd() {
		return Preparer_Foreign_Postal_Cd;
	}


	public void setPreparer_Foreign_Postal_Cd(String preparer_Foreign_Postal_Cd) {
		Preparer_Foreign_Postal_Cd = preparer_Foreign_Postal_Cd;
	}


	public String getPreparer_Phone_Num() {
		return Preparer_Phone_Num;
	}


	public void setPreparer_Phone_Num(String preparer_Phone_Num) {
		Preparer_Phone_Num = preparer_Phone_Num;
	}


	public String getPreparer_Phone_Num_Foreign() {
		return Preparer_Phone_Num_Foreign;
	}


	public void setPreparer_Phone_Num_Foreign(String preparer_Phone_Num_Foreign) {
		Preparer_Phone_Num_Foreign = preparer_Phone_Num_Foreign;
	}


	public Integer getTot_Act_Partcp_Boy_Cnt() {
		return Tot_Act_Partcp_Boy_Cnt;
	}


	public void setTot_Act_Partcp_Boy_Cnt(Integer tot_Act_Partcp_Boy_Cnt) {
		Tot_Act_Partcp_Boy_Cnt = tot_Act_Partcp_Boy_Cnt;
	}


	public String getSubj_M1_Filing_Req_Ind() {
		return Subj_M1_Filing_Req_Ind;
	}


	public void setSubj_M1_Filing_Req_Ind(String subj_M1_Filing_Req_Ind) {
		Subj_M1_Filing_Req_Ind = subj_M1_Filing_Req_Ind;
	}


	public String getCompliance_M1_Filing_Req_Ind() {
		return Compliance_M1_Filing_Req_Ind;
	}


	public void setCompliance_M1_Filing_Req_Ind(String compliance_M1_Filing_Req_Ind) {
		Compliance_M1_Filing_Req_Ind = compliance_M1_Filing_Req_Ind;
	}


	public String getM1_Receipt_Confirmation_Code() {
		return M1_Receipt_Confirmation_Code;
	}


	public void setM1_Receipt_Confirmation_Code(String m1_Receipt_Confirmation_Code) {
		M1_Receipt_Confirmation_Code = m1_Receipt_Confirmation_Code;
	}


	public String getAdmin_Manual_Signed_Date() {
		return Admin_Manual_Signed_Date;
	}


	public void setAdmin_Manual_Signed_Date(String admin_Manual_Signed_Date) {
		Admin_Manual_Signed_Date = admin_Manual_Signed_Date;
	}


	public String getAdmin_Manual_Signed_Name() {
		return Admin_Manual_Signed_Name;
	}


	public void setAdmin_Manual_Signed_Name(String admin_Manual_Signed_Name) {
		Admin_Manual_Signed_Name = admin_Manual_Signed_Name;
	}


	public String getLast_Rpt_Plan_Name() {
		return Last_Rpt_Plan_Name;
	}


	public void setLast_Rpt_Plan_Name(String last_Rpt_Plan_Name) {
		Last_Rpt_Plan_Name = last_Rpt_Plan_Name;
	}


	public String getPlanName() {
		return planName;
	}


	public void setPlanName(String planName) {
		this.planName = planName;
	}


	public String getSpons_Manual_Signed_Date() {
		return Spons_Manual_Signed_Date;
	}


	public void setSpons_Manual_Signed_Date(String spons_Manual_Signed_Date) {
		Spons_Manual_Signed_Date = spons_Manual_Signed_Date;
	}


	public String getSpons_Manual_Signed_Name() {
		return Spons_Manual_Signed_Name;
	}


	public void setSpons_Manual_Signed_Name(String spons_Manual_Signed_Name) {
		Spons_Manual_Signed_Name = spons_Manual_Signed_Name;
	}


	public String getDfe_Manual_Signed_Date() {
		return Dfe_Manual_Signed_Date;
	}


	public void setDfe_Manual_Signed_Date(String dfe_Manual_Signed_Date) {
		Dfe_Manual_Signed_Date = dfe_Manual_Signed_Date;
	}


	public String getDfe_Manual_Signed_Name() {
		return Dfe_Manual_Signed_Name;
	}


	public void setDfe_Manual_Signed_Name(String dfe_Manual_Signed_Name) {
		Dfe_Manual_Signed_Name = dfe_Manual_Signed_Name;
	}


}
