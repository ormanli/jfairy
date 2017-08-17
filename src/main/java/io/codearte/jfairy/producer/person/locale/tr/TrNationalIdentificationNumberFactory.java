package io.codearte.jfairy.producer.person.locale.tr;

import javax.inject.Inject;

import io.codearte.jfairy.producer.BaseProducer;
import io.codearte.jfairy.producer.DateProducer;
import io.codearte.jfairy.producer.person.NationalIdentificationNumberFactory;
import io.codearte.jfairy.producer.person.NationalIdentificationNumberProperties;

public class TrNationalIdentificationNumberFactory implements NationalIdentificationNumberFactory {
	private final BaseProducer baseProducer;
	private final DateProducer dateProducer;

	@Inject
	public TrNationalIdentificationNumberFactory(BaseProducer baseProducer, DateProducer dateProducer) {
		this.baseProducer = baseProducer;
		this.dateProducer = dateProducer;
	}

	@Override
	public TrNationalIdentificationNumberProvider produceNationalIdentificationNumberProvider(NationalIdentificationNumberProperties.Property... properties) {
		return new TrNationalIdentificationNumberProvider(baseProducer, properties);
	}
}
