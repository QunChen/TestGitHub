package edu.uow.earlyadmission

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@ToString(includeNames=true)
@EqualsAndHashCode
class AppAcademicRes {

	Boolean isNswResult = true
	String nonNswResult
	Boolean isSpecialCircumstance
	String specialCircumstance
	Boolean isRaw
	ResultType resultType
    Boolean isPathways = true

	static belongsTo = [ ResultType]

	static mapping = {
        id generator: 'sequence', params:[sequence:'APP_ACADEMIC_RES_SEQ']
		version false
	}

	static constraints = {
		isNswResult nullable: false
		nonNswResult nullable: true, maxSize: 1000
		isSpecialCircumstance nullable: true
		specialCircumstance nullable: true, maxSize: 1000
		isRaw nullable: false
	}
}
