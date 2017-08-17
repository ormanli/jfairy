package io.codearte.jfairy;

import java.util.Random;

import io.codearte.jfairy.data.DataMaster;
import io.codearte.jfairy.producer.VATIdentificationNumberProvider;
import io.codearte.jfairy.producer.company.locale.en.EnVATIdentificationNumberProvider;
import io.codearte.jfairy.producer.person.AddressProvider;
import io.codearte.jfairy.producer.person.NationalIdentificationNumberFactory;
import io.codearte.jfairy.producer.person.NationalIdentityCardNumberProvider;
import io.codearte.jfairy.producer.person.PassportNumberProvider;
import io.codearte.jfairy.producer.person.locale.en.EnAddressProvider;
import io.codearte.jfairy.producer.person.locale.en.EnNationalIdentityCardNumberProvider;
import io.codearte.jfairy.producer.person.locale.en.EnPassportNumberProvider;
import io.codearte.jfairy.producer.person.locale.tr.TrNationalIdentificationNumberFactory;

public class TrFairyModule extends FairyModule {

	public TrFairyModule(DataMaster dataMaster, Random random) {
		super(dataMaster, random);
	}

	@Override
	protected void configure() {
		super.configure();

		bind(NationalIdentificationNumberFactory.class).to(TrNationalIdentificationNumberFactory.class);
		bind(NationalIdentityCardNumberProvider.class).to(EnNationalIdentityCardNumberProvider.class);
		bind(VATIdentificationNumberProvider.class).to(EnVATIdentificationNumberProvider.class);
		bind(AddressProvider.class).to(EnAddressProvider.class);
		bind(PassportNumberProvider.class).to(EnPassportNumberProvider.class);
	}
}
