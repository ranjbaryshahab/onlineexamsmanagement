$(document).ready(function () {
    $(".menu").click(function () {
        const submenu = $(this).next();
        submenu.slideToggle(500);
        submenu.siblings("ul").hide(500);
    });
});

function loadPage(page) {
    if (page === 'list-incident-by-employee') {
        $('#app-content-load').load('features/incident_management/list-incident-by-employee/list-incident-by-employee.html');
    }
}
