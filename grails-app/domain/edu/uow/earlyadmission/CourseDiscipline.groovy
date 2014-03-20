package edu.uow.earlyadmission
import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class CourseDiscipline {

	String discipline
	Faculty faculty

	static hasMany = [courseSpecs: CourseSpec]
	static belongsTo = [Faculty]

	static mapping = {
        id generator: 'sequence', params:[sequence:'COURSE_DISCIPLINE_SEQ']
		version false
	}

	static constraints = {
		discipline nullable: true, maxSize: 100
	}

    String toString() {
        return discipline
    }
}
