/**
 * 
 */
app.controller('MainController',['$scope', function($scope){
	var a;
	if (condition1) {
		a = assignment_1;
	} else if (condition2) {
		a = assignment_2;
	} else if (condition3) {
		a = assignment_3;
	} else if (condition4) {
		a = assignment_4;
	} else if (condition5) {
		a = assignment_5;
	} else if (condition6) {
		a = assignment_6;
	} else if (condition7) {
		a = assignment_7;
	} else {
		a = assignment_8
	}
	//OR
	var b = ( condition1) ? assignment_1 :
			((condition1) ? assignment_1 :
			((condition1) ? assignment_1 :	
			((condition1) ? assignment_1 :
			((condition1) ? assignment_1 :
			((condition1) ? assignment_1 :
			((condition1) ? assignment_1 :
						 	assignment_1 
						 		   ))))));
}]);