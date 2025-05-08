// jss/newjs.js

// JavaScript for second navbar toggle functionality
document.addEventListener('DOMContentLoaded', function () {
    document.querySelectorAll('#offcanvasNavbar .nav-link').forEach(link => {
      link.addEventListener('click', () => {
        const offcanvasEl = document.getElementById('offcanvasNavbar');
        const bsOffcanvas = bootstrap.Offcanvas.getInstance(offcanvasEl);
        if (bsOffcanvas) {
          bsOffcanvas.hide();
        }
      });
    });
  });