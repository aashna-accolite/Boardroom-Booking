<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html ng-app="sampleApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<title>Login</title>
</head>
<body controller="mainCtrl">
	<form:form id="loginForm" modelAttribute="login" ng-submit="submit()"
		method="post">
		<table align="center">
			<tr>
				<td><form:label path="username">Username: </form:label></td>
				<td><form:input path="username" name="username" id="username" />
				</td>
			</tr>
			<tr>
				<td><form:label path="password">Password:</form:label></td>
				<td><form:password path="password" name="password"
						id="password" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><form:button id="login" name="login">Login</form:button>
				</td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><a href="index.jsp">Home</a></td>
			</tr>
		</table>
	</form:form>
	<script type="text/javascript">
		(function() {

			var app = angular.module("sampleApp", []);

			app.controller("mainCtrl", [
					$scope,
					$http,
					function($scope, $http) {
						var form = {
							"name" : "nikhil",
							"pass" : "pass",
						};
						var submit = function() {
							$http.post("/loginProcess", $scope.form).then(
									onSuccess, onError);
						};

						$scope.onSuccess = function(response) {
							console.log(response);
						};

						$scope.onError = function(response) {
							console.log("error");
						};
					}]);

		})();
	</script>
	<table align="center">
		<tr>
			<%-- <td style="font-style: italic; color: red;">${message}</td> --%>
		</tr>
	</table>
</body>
</html>