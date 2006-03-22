SECTION = "devel"
DESCRIPTION = "The Linux trace toolkit is a suite of tools designed to \
extract program execution details from the Linux operating system and  \
interpret them."
LICENSE = "GPL"
MAINTAINER = "Richrd Purdie <richard@openedhand.com>"
PR = "r1"
DEPENDS = "gtk+ pango popt"

ALTNAME = "LinuxTraceToolkitViewer-0.8.34-17032006"

SRC_URI = "http://ltt.polymtl.ca/packages/${ALTNAME}.tar.gz "
S = "${WORKDIR}/${ALTNAME}"

inherit autotools

FILES_${PN} += "\
    ${libdir}/lttv/plugins/* \
    ${datadir}/LinuxTraceToolkitViewer/facilities/* \
    ${datadir}/LinuxTraceToolkitViewer/pixmaps/* "
