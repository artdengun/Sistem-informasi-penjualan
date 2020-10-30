/**
 * 
 */

$('document').ready(function() {
	
	$('.table .btn-primary').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(pelanggan, status){
			$('#id_pelangganEdit').val(pelanggan.id_pelanggan);
			$('#nama_pelangganEdit').val(pelanggan.nama_pelanggan);
			$('#alamat_pelangganEdit').val(pelanggan.alamat_pelanggan);
			$('#tlp_pelangganEdit').val(pelanggan.tlp_pelanggan);
			$('#email_pelangganEdit').val(pelanggan.email_pelanggan);
		});			
		$('#editModal').modal();		
	});
	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();
		var href= $(this).attr('href');
		$.get(href, function(pelanggan, status){
			$('#id_pelangganDetails').val(pelanggan.id_pelanggan);
			$('#nama_pelangganDetails').val(pelanggan.nama_pelanggan);
			$('#alamat_pelangganDetails').val(pelanggan.alamat_pelanggan);
			$('#tlp_pelangganDetails').val(pelanggan.tlp_pelanggan);
			$('#email_pelangganDetails').val(pelanggan.email_pelanggan);
			$('#lastModifiedByDetails').val(pelanggan.lastModifiedBy);
            $('#lastModifiedDateDetails').val(pelanggan.lastModifiedDate.substr(0,19).replace("T", " "));
				});
		$('#detailsModal').modal();
	});
	
	$('.table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);
		$('#deleteModal').modal();		
	});	
});